#include <stdio.h>

int main(void)
{
    int counter = 1;

    do
    {
        printf("hello\n");
        counter++;
    } while (counter < 1);

    printf("\n\n");

    counter = 1;
    while (counter < 1)
    {
        printf("hello\n");
        counter++;
    }

    return 0;
}