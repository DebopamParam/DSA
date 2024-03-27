class BST:
    def __init__(self) -> None:
        self.__root = None

    @property
    def root(self):
        return self.__root

    class Node:
        def __init__(self, val: int) -> None:
            self.val = val
            self.left = None
            self.right = None

    def height(self, node: Node) -> int:
        if node is None:
            return -1
        left = self.height(node.left)
        right = self.height(node.right)
        if left == -1 and right == -1:
            return 0
        return 1 + max(left, right)

    def insert(self, val: int) -> None:
        if self.__root is None:
            self.__root = self.Node(val)
            return
        self.__root = self.__insert(val, self.__root)

    def __insert(self, val: int, node: Node) -> Node:
        if node is None:
            return self.Node(val)
        if val < node.val:
            node.left = self.__insert(val, node.left)
        if val > node.val:
            node.right = self.__insert(val, node.right)
        return node

    def inorder_traversal(self, root: Node) -> None:
        if root is None:
            return
        self.inorder_traversal(root.left)
        print(root.val, end="\t")
        self.inorder_traversal(root.right)

    def pretty_print(self) -> None:
        """Pretty print the binary tree"""
        self.__pretty_print(self.root, 0)

    def __pretty_print(self, node: Node, level: int) -> None:
        if node is None:
            return
        else:
            self.__pretty_print(node.right, level + 1)
            if level == 0:  # root node
                print(f"{node.val} {self.height(node)}")
            else:
                # print spaces only when level is 2 or more
                print("|\t" * (level - 1), end="")
                # Then print the node value
                print("|------->", f"{node.val} {self.height(node)}")
            self.__pretty_print(node.left, level + 1)


bst = BST()
bst.insert(13)
bst.insert(10)
bst.insert(15)
bst.insert(16)
bst.insert(10)
bst.insert(5)
bst.insert(11)
bst.insert(4)
bst.insert(8)
bst.insert(3)

bst.pretty_print()
