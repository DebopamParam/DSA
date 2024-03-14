from typing import Optional

from yaml import Node


class BST:
    def __init__(self) -> None:
        self.root = None

    def is_empty(self) -> bool:
        """Check if the binary tree is empty or not"""
        return self.root is None

    class Node:
        """A node in a binary tree. It has a left and right values"""

        def __init__(
            self,
            value: int,
            left: Optional["Node"] = None,
            right: Optional["Node"] = None,
            height: int = -1,
        ) -> None:
            self.__value = value
            self.right = right
            self.left = left
            self.height = height

        @property
        def value(self) -> int:
            """Get the value of the node"""
            return self.__value

    def insert(self, value: int) -> None:
        """Insert a value into the binary tree"""
        if self.is_empty():
            self.root = self.Node(value)
        else:
            self.__insert(value, self.root)

    def __insert(self, value: int, node: Optional[Node] = None) -> Node:
        if node is None:
            return self.Node(value)

        if value < node.value:
            node.left = self.__insert(value, node.left)
        elif value > node.value:
            node.right = self.__insert(value, node.right)
        return node

    def display(self) -> None:
        """Display the binary tree"""
        self.__display(self.root)

    def __display(self, node: Optional[Node] = None) -> None:
        if node is None:
            return

    def pretty_print(self) -> None:
        """Pretty print the binary tree"""
        self.__pretty_print(self.root, 0)

    def __pretty_print(self, node: Node, level: int) -> None:
        if node is None:
            return
        else:
            self.__pretty_print(node.right, level + 1)
            if level == 0:  # root node
                print(node.value)
            else:
                # print spaces only when level is 2 or more
                print("|\t" * (level - 1), end="")
                # Then print the node value
                print("|------->", node.value)
            self.__pretty_print(node.left, level + 1)
    


bst = BST()
bst.insert(10)
bst.insert(5)
bst.insert(20)
bst.insert(8)
bst.insert(30)
bst.pretty_print()
