from typing import List


class SegmentTree:
    def __init__(self) -> None:
        self.root = None

    class Node:  # Changed class name to camel case
        def __init__(self) -> None:
            self.left = None
            self.right = None
            self.value = 0
            self.range = [0, 0]

    def build_tree(self, arr: List[int]) -> None:
        if not arr:
            return None
        self.root = self.__build_tree(arr, 0, len(arr) - 1)

    def __build_tree(self, arr: List[int], low: int, high: int) -> Node:
        if low > high:
            # All the array elements have been already covered
            return None
        if low == high:
            # Only one element is left
            val = arr[low]
            node = self.Node()  # Changed class name to camel case
            node.value = val
            node.range = [low, high]
            return node
        # More than one element is there in the range
        # So Create a Node
        node = self.Node()  # Changed class name to camel case
        # Store the range of the Node
        node.range = [low, high]
        # Divide the range into two parts
        mid = (low + high) // 2
        # Recursively build the left and right subtree
        node.left = self.__build_tree(arr, low, mid)
        node.right = self.__build_tree(arr, mid + 1, high)
        # When the left and right subtree returns
        # We will get the query(in this case sum)
        node.value = node.left.value + node.right.value
        # Then return it to the callee
        return node

    def query(self, low: int, high: int) -> int:
        if self.root is None:
            # Segment tree is empty
            return 0
        if low < 0 or high >= len(arr):
            # Invalid range
            print("Invalid Range")
            raise ValueError("Invalid Range")
        return self.__query(self.root, low, high)

    def __query(self, node: "Node", query_low: int, query_high: int) -> int:
        # Case 1 : Node interval is completely inside the query interval
        # Poora kaam ka cheez h, to poora return kar do
        if query_low <= node.range[0] and query_high >= node.range[1]:
            return node.value
        # Case 2 : Node interval is completely outside the query interval
        # Kuch kaam ka nahi h, to 0 return kar do
        elif query_high < node.range[0] or query_low > node.range[1]:
            return 0
        # Case 3 : Overlapping ---- matlab some part kaam ka hai
        # Check left and right subtree and pick the necessary values and discard the rest
        else:
            left_sum = self.__query(node.left, query_low, query_high)
            right_sum = self.__query(node.right, query_low, query_high)
            return left_sum + right_sum

    # Inorder Traversal of the tree
    def display(self) -> None:
        if self.root is None:
            return
        self.__display(self.root)

    def __display(self, node: Node) -> None:
        if node is None:
            return
        self.__display(node.left)
        print(f"{node.value}{node.range}", end="   ")
        self.__display(node.right)

    # Update
    def update(self, index: int, value: int) -> None:
        if self.root is None:
            return
        if index < 0 or index >= len(arr):
            raise ValueError("Invalid Index")
        self.root.value = self.__update(self.root, index, value)

    def __update(self, node: Node, index: int, value: int) -> int:
        # Case 1: if the index is out of the range of the current node.
        # You won't find the leaf node in it's children
        # just return the existing value(query)
        if index not in range(node.range[0], node.range[1] + 1):
            return node.value
        # Base condition
        elif node.range[0] == node.range[1] == index:
            node.value = value
            return node.value
        # Case 2: if the index is in the range of the current node
        # recursively check the left and right child to find the leaf node
        elif index in range(node.range[0], node.range[1] + 1):
            left_sum = self.__update(node.left, index, value)
            right_sum = self.__update(node.right, index, value)
            # Update the value(query) of the current node
            node.value = left_sum + right_sum
            return node.value


# MAIN
arr = [3, 8, 7, 6, -2, -8, 4, 9]
st = SegmentTree()
st.build_tree(arr)
# st.display()
# print(st.query(0, 0))
st.update(5, 16)
st.display()
