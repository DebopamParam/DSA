from collections import deque
from turtle import left
from typing import List, Optional


class BinaryTree:
    def __init__(self) -> None:
        self.root = None
        self.bfs_levels = []

    class Node:
        def __init__(self, value=0) -> None:
            self.left = None
            self.right = None
            self.value = value

    def populate_tree(self, arr: List[int]) -> None:
        if not arr:
            return None
        self.root = self.__populate_tree(arr)

    def __populate_tree(self, arr: List[int]) -> Node:
        # If the array is empty, return None
        if not arr:
            return None
        # If the array has only one element,
        # return a new node with that value
        if len(arr) == 1:
            return self.Node(arr[0])
        # Find the middle element of the array
        mid = len(arr) // 2
        # Create a new node and set the value to the middle element
        node = self.Node(arr[mid])
        # Recursively set the left and right children of the node
        node.left = self.__populate_tree(arr[0:mid])
        node.right = self.__populate_tree(arr[mid + 1 : len(arr)])
        return node

    def pretty_print(self) -> None:
        """Pretty print the binary tree"""
        self.__pretty_print(self.root, 0)

    def __pretty_print(self, node: Node, level: int) -> None:
        if node is None:
            return
        else:
            self.__pretty_print(node.right, level + 1)
            if level == 0:  # root node
                print(f"{node.value}")
            else:
                # print spaces only when level is 2 or more
                print("|\t" * (level - 1), end="")
                # Then print the node value
                print("|------->", f"{node.value}")
            self.__pretty_print(node.left, level + 1)

    def bfs(self) -> None:
        if self.root is None:
            None
        ans = []
        queue = [self.root]
        while queue:
            n = len(queue)
            level = []
            for _ in range(n):
                curr = queue.pop(0)
                level.append(curr.value)
                if curr.left:
                    queue.append(curr.left)
                if curr.right:
                    queue.append(curr.right)
            ans.append(level)
        return ans

    def level_order_successor(self, key):
        if self.root is None:
            return None
        queue = [self.root]
        while queue:
            node = queue.pop(0)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
            if node.value == key:
                break
        if queue:
            return queue[0].value
        else:
            return None

    def inorderSuccessor(self, root, x):
        ans = [None]
        # Code here
        self.helper(root, x, ans)
        return ans[0]

    def helper(self, node, x, ans):
        if node is None:
            return
        if node.value is x:
            self.find_answer(node.right, ans)
            return
        self.helper(node.left, x, ans)
        self.helper(node.right, x, ans)

    def find_answer(self, node, ans):
        if node is None:
            return
        while node.left is not None:
            node = node.left
        ans[0] = node.value

    def zigzagLevelOrder(self, root: Optional[Node]) -> List[List[int]]:
        if root is None:
            return []
        ans = []
        queue = deque([root])
        level_is_odd = True
        while queue:
            level = []
            n = len(queue)

            for _ in range(n):
                if level_is_odd:
                    # Traverse from left to right in the queue
                    node = queue.popleft()
                    # Append the children at the end of the queue (left first, then right)
                    if node.left:
                        queue.append(node.left)
                    if node.right:
                        queue.append(node.right)
                    level.append(node.value)
                else:
                    # Traverse from right to left
                    node = queue.pop()
                    # Append the children at the start (right first, then left)
                    if node.right:
                        queue.appendleft(node.right)
                    if node.left:
                        queue.appendleft(node.left)
                    level.append(node.value)
            level_is_odd = not level_is_odd
            ans.append(level)
        return ans


# MAIN
arr = [1, 2, 3, 4, 5, 6, 7]
bt = BinaryTree()
bt.populate_tree(arr)
bt.pretty_print()
# print(bt.bfs())
# print(bt.level_order_successor(6))
print(bt.zigzagLevelOrder(bt.root))
