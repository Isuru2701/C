#include <stdio.h>

int main(void)
{
    int num, factorial = 1;
    printf("enter number: ");
    scanf("%d", &num);
    if (num > 0)
    {

        for (int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }

        printf("factorial of %i is %i", num, factorial);
    }
    else
    {
        printf("Number must not be Negative");
    }

    return 0;
}