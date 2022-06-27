#include <stdio.h>

void Square(int rows);

int main(void)
{

    int side;

    printf("enter number of rows: ");
    scanf("%d", &side);
    Square(side);
    return 0;
}

void Square(int rows)
{
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < rows; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}