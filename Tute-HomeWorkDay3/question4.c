#include <stdio.h>

int main(void)
{

    int num1 = 20;
    int num2 = 10;
    int *n1, *n2;

    //pointers
    n1 = &num1;
    n2 = &num2;

    printf("addition of num1 and num2 using pointers: %d", *n1 + *n2);

    return 0;
}