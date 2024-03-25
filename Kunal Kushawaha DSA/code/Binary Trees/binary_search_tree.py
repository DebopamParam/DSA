from typing import Optional
from typing import List


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
            height: int = 0,
        ) -> None:
            self.__value = value
            self.right = right
            self.left = left
            self.__height = height

        @property
        def value(self) -> int:
            """Get the value of the node"""
            return self.__value

        @property
        def height(self) -> int:
            """Get the height of the node"""
            return self.__height

        @height.setter
        def height(self, value: int) -> None:
            """Set the height of the node"""
            self.__height = value

    def height(self, node: Node) -> int:
        """Get the height of the node"""
        if node is None:
            return -1
        return node.height

    def insert(self, value: int) -> None:
        """Insert a value into the binary tree"""
        if self.is_empty():
            self.root = self.Node(value)
        else:
            self.__insert(value, self.root)

    def __insert(self, value: int, node: Optional[Node] = None) -> Node:
        if node is None:
            new_node = self.Node(value)
            return new_node

        if value < node.value:
            node.left = self.__insert(value, node.left)
        elif value > node.value:
            node.right = self.__insert(value, node.right)

        node.height = 1 + max(self.height(node.left), self.height(node.right))

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
                print(f"{node.value} {node.height}")
            else:
                # print spaces only when level is 2 or more
                print("|\t" * (level - 1), end="")
                # Then print the node value
                print("|------->", f"{node.value} {node.height}")
            self.__pretty_print(node.left, level + 1)

    def is_balanced(self) -> bool:
        """Check if the binary tree is balanced or not"""
        return self.__is_balanced(self.root)

    def __is_balanced(self, node: Optional[Node] = None) -> bool:
        if node is None:
            return True
        return (
            abs(self.height(node.left) - self.height(node.right)) <= 1
            and self.__is_balanced(node.left)
            and self.__is_balanced(node.right)
        )

    def populate_from_sorted_list(self, items: List[int]) -> None:
        """Populate BST from a sorted List"""
        if not items:
            return
        list_length = len(items)
        mid = list_length // 2
        self.insert(items[mid])
        self.populate_from_sorted_list(items[:mid])
        self.populate_from_sorted_list(items[mid + 1 :])

    def populate_from_sorted_list_space_optimized(self, items: List[int]) -> None:
        self.__populate_from_sorted_list_space_optimized(items, 0, len(items) - 1)

    def __populate_from_sorted_list_space_optimized(
        self, items: List[int], start: int, end: int
    ) -> None:
        if start > end:
            return
        mid = (start + end) // 2
        self.insert(items[mid])
        self.__populate_from_sorted_list_space_optimized(items, start, mid - 1)
        self.__populate_from_sorted_list_space_optimized(items, mid + 1, end)


bst = BST()
items = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

bst.populate_from_sorted_list_space_optimized(items)
bst.pretty_print()
