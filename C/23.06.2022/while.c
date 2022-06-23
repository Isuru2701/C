#include <stdio.h>

int main(void)
{
    char mychar;

    int counter = 0;


    while (counter < 5)
    {
        printf("enter character %i: ", counter+1);
        scanf(" %c", &mychar);
        printf("character is %c\n", mychar);
        counter++;
    }


    return 0;
}