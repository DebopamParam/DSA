#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int count = 0;

struct node
{
    int id;
    char name[20], branch[10], aos[10];
    struct node *next;
    struct node *prev;
} *first = NULL, *last = NULL, *temp = NULL;

void create()
{
    int id;
    char name[20], branch[10], aos[10];
    temp = (struct node *)malloc(sizeof(struct node));
    printf("Enter ID,NAME,BRANCH,AREA OF SPECIALIZATION:\n");
    scanf("%d%s%s%s", &id, name, branch, aos);
    strcpy(temp->aos, aos);
    strcpy(temp->name, name);
    strcpy(temp->branch, branch);
    temp->id = id;
    temp->next = NULL;
    temp->prev = NULL;
    count++;
}
void insert_end()
{
    if (first == NULL)
    {
        create();
        first = last = temp;
    }
    else
    {
        create();
        last->next = temp;
        temp->prev = last;
        last = temp;
    }
}
void display()
{
    temp = first;
    if (first == NULL)
    {
        printf("List is empty\n");
        return;
    }
    else
    {
        printf("\nDetails of the professors are:\n");
        printf("ID\tNAME\tBRANCH\tAREA OF SPECIALIZATION:\n");
        while (temp != NULL)
        {
            printf("%d\t%s\t%s\t%s\n", temp->id, temp->name, temp->branch, temp->aos);
            temp = temp->next;
        }
        printf("No. of professors = %d\n", count);
    }
}
void delete_front()
{
    if (first == NULL)
    {
        printf("The list is empty\n");
        return;
    }
    else if (first->next == NULL)
    {
        printf("The deleted details of student are:\n");
        printf("%d\t%s\t%s\t%s\n", temp->id, temp->name, temp->branch, temp->aos);
        free(first);
        first = NULL;
    }
    else
    {
        temp = first;
        first = first->next;
        first->prev = NULL;
        printf("The deleted details of student are:\n");
        printf("%d\t%s\t%s\t%s\n", temp->id, temp->name, temp->branch, temp->aos);
        free(temp);
    }
    count--;
}
int main()
{
    int ch, n, i;
    while (1)
    {
        printf("--------QUEUE of Professors using DLL--------\n");
        printf("1.CREATE DLL QUEUE of n professors\n");
        printf("2.DISPLAY the QUEUE of professors\n");
        printf("3.INSERT END\n");
        printf("4.DELETE FRONT\n");
        printf("5.EXIT\n");
        printf("\nEnter choice:\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Enter number of professors:\n");
            scanf("%d", &n);
            for (i = 0; i < n; i++)
            {
                insert_end();
            }
            break;
        case 2:
            display();
            break;
        case 3:
            insert_end();
            break;
        case 4:
            delete_front();
            break;
        case 5:
            exit(0);
        default:
            printf("Wrong choice\n");
        }
    }
    return 0;
}