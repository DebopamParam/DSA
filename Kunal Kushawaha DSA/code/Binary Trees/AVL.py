class TreeNode:
    """
    Represents a node in the AVL tree.
    """

    def __init__(self, val=0, left=None, right=None):
        """
        Initializes a new instance of the TreeNode class.

        Args:
            val: The value of the node.
            left: The left child of the node.
            right: The right child of the node.
        """
        self.val = val
        self.left = left
        self.right = right
        self.height = 0


class AVL:
    """
    Represents an AVL tree.
    """

    def __init__(self):
        """
        Initializes a new instance of the AVL class.
        """
        self.root = None

    def get_height(self, node) -> int:
        """
        Returns the height of the given node.

        Args:
            node: The node to get the height of.

        Returns:
            The height of the node.
        """
        if node is None:
            return -1
        return node.height

    def insert(self, val) -> None:
        """
        Inserts a new value into the AVL tree.

        Args:
            val: The value to insert.
        """
        if self.root is None:
            self.root = TreeNode(val)
        else:
            self.root = self.__insert(self.root, val)

    def __insert(self, node, val) -> TreeNode:
        """
        Inserts a new value into the AVL tree recursively.

        Args:
            node: The current node being processed.
            val: The value to insert.

        Returns:
            The updated node after insertion.
        """
        if node is None:
            return TreeNode(val)
        if val < node.val:
            node.left = self.__insert(node.left, val)
        elif val > node.val:
            node.right = self.__insert(node.right, val)

        node.height = 1 + max(self.get_height(node.left), self.get_height(node.right))
        return self.rotate(node)

    def rotate(self, node) -> TreeNode:
        """
        Performs rotation on the given node if necessary to maintain AVL balance.

        Args:
            node: The node to perform rotation on.

        Returns:
            The updated node after rotation.
        """
        if (self.get_height(node.left) - self.get_height(node.right)) > 1:
            # left heavy
            if (self.get_height(node.left.left) - self.get_height(node.left.right)) > 0:
                # left - left heavy
                return self.rotate_right(node)  # Along p
            else:
                # left - right heavy
                node.left = self.rotate_left(node.left)
                return self.rotate_right(node)
        elif (self.get_height(node.left) - self.get_height(node.right)) < -1:
            # right heavy
            if (
                self.get_height(node.right.left) - self.get_height(node.right.right)
            ) < 0:
                # right - right heavy
                return self.rotate_left(node)  # Along p
            else:
                # right - left heavy
                node.right = self.rotate_right(node.right)
                return self.rotate_left(node)
        return node

    def rotate_right(self, p):
        """
        Performs a right rotation on the given node.

        Args:
            p: The node to perform right rotation on.

        Returns:
            The updated node after right rotation.
        """
        c = p.left
        t = c.right
        c.right = p
        p.left = t
        p.height = 1 + max(self.get_height(p.left), self.get_height(p.right))
        c.height = 1 + max(self.get_height(c.left), self.get_height(c.right))
        return c

    def rotate_left(self, p):
        """
        Performs a left rotation on the given node.

        Args:
            p: The node to perform left rotation on.

        Returns:
            The updated node after left rotation.
        """
        c = p.right
        t = c.left
        c.left = p
        p.right = t
        p.height = 1 + max(self.get_height(p.left), self.get_height(p.right))
        c.height = 1 + max(self.get_height(c.left), self.get_height(c.right))
        return c
