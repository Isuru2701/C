#include <stdio.h>

float cube(float num);

int main(void)
{
    float number;
    printf("enter number to cube: ");
    scanf("%f", &number);
    printf("%.2f", cube(number));    

    return 0;
}

float cube(float num)
{
    return num * num * num;
}

