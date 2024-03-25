class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def build_expression_tree(expression):
    if not expression:
        return None

    operator = expression.pop(0)
    node = TreeNode(operator)

    if operator.isdigit():
        return node

    node.left = build_expression_tree(expression)
    node.right = build_expression_tree(expression)

    return node


def __pretty_print(node: TreeNode, level: int) -> None:
    if node is None:
        return
    else:
        __pretty_print(node.right, level + 1)
        if level == 0:  # root node
            print(f"{node.value}")
        else:
            # print spaces only when level is 2 or more
            print("|\t" * (level - 1), end="")
            # Then print the node value
            print("|------->", f"{node.value}")
        __pretty_print(node.left, level + 1)


expression = ["+", "*", "2", "3", "4"]
root = build_expression_tree(expression)
__pretty_print(root, 0)
