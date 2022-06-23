#include <stdio.h>

int main(void)
{
    int myint = 0, sum = 0;
    int counter = 0;

    while (counter < 5)
    {
        printf("enter character %i: ", counter+1);
        scanf(" %i", &myint);
        sum += myint;
        counter++;
    }

    //kill me

    printf("sum is %i", sum);


    return 0;
}