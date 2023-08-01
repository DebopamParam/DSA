#include <stdlib.h>
#include <stdio.h>
struct node
{
    int data;
    struct node *left;
    struct node *right;
};
typedef struct node *NODE;
NODE insert_node(int item, NODE root)
{
    NODE cur, temp, prev;
    temp = (NODE)malloc(sizeof(struct node));
    temp->data = item;
    temp->left = temp->right = NULL;
    if (root == NULL)
        return temp;
    prev = NULL;
    cur = root;
    while (cur != NULL)
    {
        prev = cur;
        if (item < cur->data)
        {
            cur = cur->left;
        }
        else
        {
            cur = cur->right;
        }
    }
    if (item < prev->data)
    {
        prev->left = temp;
    }
    else
    {
        prev->right = temp;
    }
    return root;
}
void inorder(NODE root)
{
    if (root == NULL)
        return;
    inorder(root->left);
    printf("%d\n", root->data);
    inorder(root->right);
}
void preorder(NODE root)
{
    if (root == NULL)
        return;
    printf("%d\n", root->data);
    preorder(root->left);
    preorder(root->right);
}
void postorder(NODE root)
{
    if (root == NULL)
        return;
    postorder(root->left);
    postorder(root->right);
    printf("%d\n", root->data);
}
int main()
{
    NODE root = NULL;
    int item, choice, n;
    for (;;)
    {
        printf("\n----- MENU -----\n");
        printf("\n1:insert_node\n2:inorder\n3:preorder\n4:postorder\n5:exit\n");
        printf("Enter your choice:\n");
        scanf("%d", &choice);
        // printf("\n");
        switch (choice)
        {
        case 1:
            printf("Enter the no. of nodes\n");
            scanf("%d", &n);
            printf("enter the item to be inserted\n");
            for (int i = 0; i < n; i++)
            {
                scanf("%d", &item);
                root = insert_node(item, root);
            }
            break;
        case 2:
            if (root == NULL)
            {
                printf("the tree is empty\n");
            }
            else
            {
                inorder(root);
            }
            break;
        case 3:
            if (root == NULL)
            {
                printf("the tree is empty\n");
            }
            else
            {
                preorder(root);
            }
            break;
        case 4:
            if (root == NULL)
            {
                printf("the tree is empty\n");
            }
            else
            {
                postorder(root);
            }
            break;
        case 5:
            exit(0);
        default:
            printf("re-Enter\n");
        }
    }
}
