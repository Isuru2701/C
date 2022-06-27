#include <stdio.h>

float Multiply(float n1, float n2);

int main(void)
{

    float num1, num2;
    printf("enter number 1: ");
    scanf("%f", &num1);
    printf("enter number 2: ");
    scanf("%f", &num2);

    printf("multiplication is: %.2f", Multiply(num1, num2));
}

float Multiply(float n1, float n2)
{
    return n1 * n2;
}