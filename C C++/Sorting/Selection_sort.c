#include <stdio.h>
#include <stdlib.h>
void main()
{
    int r1 , r2 , c1 ,c2 ;
    printf("Enter the row & column of the first matrix: \n");
    scanf("%d%d", &r1, &c1);
    printf("Enter the row & column of the first matrix: \n");
    scanf("%d%d", &r2, &c2);
    int a[r1][c1] , b[r2][c2] , c[r1][c2];
    if (c2!=r1){
        printf("Multiplication is not possible.\n");
        exit(0);
    }
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            scanf("%d\t", &a[i][j]); 
        }
    }

}
