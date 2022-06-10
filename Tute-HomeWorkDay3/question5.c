#include <stdio.h>

int main(void)
{
    // reusing from q4
    int num1 = 20;
    int num2 = 10;

    // pointers
    int *n1, *n2;

    n1 = &num1;
    n2 = &num2;

    printf("maximum number between num1(%d) and num2(%d): %d", num1, num2, (*n1 > *n2) ? *n1 : *n2); // ternary operator removes need for another variable

    return 0;
}