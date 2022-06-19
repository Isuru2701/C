#include <stdio.h>

int main(void)
{
    int x, y;

    printf("enter value for y:");
    scanf("%d", &y);

    x = (y == 50) ? 10 : 50;

    printf("value of x is %d", x);
}