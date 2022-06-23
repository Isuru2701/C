#include <stdio.h>

int main(void)
{
    int num;
    printf("enter number: ");
    scanf("%d", &num);

    if (num % 2 != 0)
    {
        printf("number is odd, so square of it is: %d", num * num);
    }
    else
    {
        printf("number is even, so cube of it is: %d", num * num * num);
    }

    return 0;
}