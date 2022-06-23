#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    float num1 = 0, num2 = 0;

    printf("enter value for number 1: ");
    scanf("%f", &num1);
    printf("enter value for number 2: ");
    scanf("%f", &num2);


    printf("sum: %.2f | difference: %.2f |\n product: %.2f | quotient: %.2f |\n remainder: %d",
           num1 + num2, num1 - num2, num1 * num2, num1 / num2, (int)num1 % (int)num2);

    return 0;
}
