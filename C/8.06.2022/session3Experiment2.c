#include <stdio.h>

int main(void)
{
    int num;

    printf("enter a value: ");
    scanf("%d", &num);

    if (num > 0)
    {
        printf("number %d is positive", num);
    }
    else if (num < 0)
    {
        printf("number %d is negative", num);
    }
    else
    {
        printf("number is zero");
    }

    printf("\nto try another program, run this program again");

    return 0;
}