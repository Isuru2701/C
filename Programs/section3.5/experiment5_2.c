#include <stdio.h>

int main(void)
{
    float sum = 0;

    for (int i = 1; i <= 10; ++i)
    {
        sum += (1 / (float)i);
    }

    printf("sum is %.7f", sum);

    return 0;
}