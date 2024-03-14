from typing import Optional


class BinaryTree:
    """You can use it to create a Binary Tree"""

    def __init__(self):
        self.root = None

    class Node:
        """A node in a binary tree. It has a left and right values"""

        def __init__(
            self,
            value: int,
            left: Optional["Node"] = None, # type: ignore
            right: Optional["Node"] = None, # type: ignore
        ):
            self.value = value
            self.left = left
            self.right = right

    def populate(self, node: Node) -> None:
        """Populate the binary tree with user input"""
        if self.root is None:
            self._build_root()
            node = self.root
        check_left = input(f"Do you want to add a left child to {node.value} ? (y/n)")
        if check_left == "y":
            node.left = self.Node(int(input("Enter the value of the left child: ")))
            self.populate(node.left)

        check_right = input(f"Do you want to add a right child to {node.value} ? (y/n)")
        if check_right == "y":
            node.right = self.Node(int(input("Enter the value of the right child: ")))
            self.populate(node.right)

    def _build_root(self) -> None:
        self.root = self.Node(int(input("Enter the value of the root node: ")))

    def display(self) -> None:
        """Display the binary tree in a human-readable format"""
        self._display(self.root, "")

    def _display(self, node: Node, indent: str):
        if node is None:
            return
        print(indent + str(node.value))
        self._display(node.left, indent + "\t")
        self._display(node.right, indent + "\t")

    def pretty_print(self) -> None:
        """Pretty print the binary tree"""
        self._pretty_print(self.root, 0)

    def _pretty_print(self, node: Node, level: int) -> None:
        if node is None:
            return
        else:
            self._pretty_print(node.right, level + 1)
            if level == 0:  # root node
                print(node.value)
            else:
                # print spaces only when level is 2 or more
                print("|\t" * (level - 1), end="")
                # Then print the node value
                print("|------->", node.value)
            self._pretty_print(node.left, level + 1)


binary_tree = BinaryTree()
binary_tree.populate(binary_tree.root)
binary_tree.pretty_print()
