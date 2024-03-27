class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        self.height = 0  # New attribute


class AVL:
    def __init__(self):
        self.root = None

    def get_height(self, node) -> int:
        if node is None:
            return -1
        return node.height

    def insert(self, val) -> None:
        if self.root is None:
            self.root = TreeNode(val)
        else:
            self.root = self.__insert(self.root, val)

    def __insert(self, node, val) -> TreeNode:
        if node is None:
            return TreeNode(val)
        if val < node.val:
            node.left = self.__insert(node.left, val)
        elif val > node.val:
            node.right = self.__insert(node.right, val)

        node.height = 1 + max(self.get_height(node.left), self.get_height(node.right))
        return self.rotate(node)

    def rotate(self, node) -> TreeNode:
        # None is check is not required, because rotate is never called
        # when node is None
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
            if (self.get_height(node.right.left) - self.get_height(node.right.right)) < 0:
                # right - right heavy
                return self.rotate_left(node)  # Along p
            else:
                # right - left heavy
                node.right = self.rotate_right(node.right)
                return self.rotate_left(node)
        return node

    def rotate_right(self, p):
        c = p.left
        t = c.right
        c.right = p
        p.left = t
        p.height = 1 + max(self.get_height(p.left), self.get_height(p.right))
        c.height = 1 + max(self.get_height(c.left), self.get_height(c.right))
        return c

    def rotate_left(self, p):
        c = p.right
        t = c.left
        c.left = p
        p.right = t
        p.height = 1 + max(self.get_height(p.left), self.get_height(p.right))
        c.height = 1 + max(self.get_height(c.left), self.get_height(c.right))
        return c