#include <stdio.h>

int main(void)
{
    int num, evenSum = 0, oddSum = 0;

    for (int i = 0; i < 6; i++)
    {
        printf("enter number: ");
        scanf(" %i", &num);

        if(num % 2 == 0)
        {
            evenSum += num;
        }
        else
        {
            oddSum += num;
        }
    }
    printf("sum of odd numbers: %i\n", oddSum);
    printf("sum of even numbers: %i", evenSum);

    return 0;
}