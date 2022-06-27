#include <stdio.h>

long Max(long n1, long n2);

int main(void)
{
    long num1, num2;
    printf("enter number 1: ");
    scanf("%ld", &num1);
    printf("enter number 2: ");
    scanf("%ld", &num2);

    printf("maximum is %ld", Max(num1, num2));

    return 0;
}

long Max(long n1, long n2)
{
    return n1 > n2 ? n1 : n2;
}