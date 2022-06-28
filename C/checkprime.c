#include <stdio.h>

int main(void)
{
    int num;
    printf("enter number to check: ");
    scanf("%d", &num);


    //one is not a prime
    for (int i = 2; i < num; i++)
    {
        if ((num % i) == 0)
        {
            printf("number is not a prime");
            return 0;
        }
    }
    printf("number is a prime");

    return 0;
}