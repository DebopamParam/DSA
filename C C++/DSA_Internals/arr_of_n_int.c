#include <stdio.h>
#include <stdlib.h>
int a[20];
int n = 0;
void create()
{
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    printf("Enter the elements for the array:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
}
void display()
{
    printf("The array elements are:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d\n", a[i]);
    }
}
int main()
{
    int choice;
    while (1)
    {
        printf("A program to perform array operation\n");
        printf("1. Create\n");
        printf("2. Display\n");
        printf("3. Exit\n");
        printf("Enter your choice: \n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            create();
            break;
        case 2:
            display();
            break;
        case 3:
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
}