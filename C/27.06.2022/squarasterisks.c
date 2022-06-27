#include <stdio.h>

void Square(int rows);
void Triangle(int rows);

int main(void)
{

    int side;

    printf("enter number of rows: ");
    scanf("%d", &side);
    Square(side);
    Triangle(side);
    return 0;
}

void Square(int rows)
{
    for (int i = 0; i < rows; i++)
    {
        for(int j = 0; j< rows;j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void Triangle(int rows)
{
    for (int i = 0; i < rows; i++)
    {
        for (int k = rows - i; k > 0; k--)
        {
            printf(" ");
        }
        for (int j = 0; j < 2 * i - 1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

/*

  8
 88
888

*/