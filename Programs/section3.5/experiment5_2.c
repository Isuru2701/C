#include <stdio.h>

int main(void)
{
    float sum = 0;

    for(int i = 1; i <=10; ++i)
    {
        sum += 1/i;
    }

    printf("sum is %.3f", sum);

    return 0;
}