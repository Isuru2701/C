#include <stdio.h>

int main(void)
{
    int num, sum = 0;

    int counter = 0;

    while (counter < 6)
    {
        printf("enter character %i: ", counter + 1);
        scanf(" %i", &num);
        if (num > 100)
        {
            sum += num;
        }
        ++counter;
    }

    printf("sum is: %i", sum);
    return 0;
}