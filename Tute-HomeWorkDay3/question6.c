#include <stdio.h>

int main(void)
{
    int arr[5]; //assuming 'n elements' in question 6 allows for any arbitrary size
    int *pointer; 

    pointer = arr;

    arr[0] = 23;
    arr[1] = 3;
    arr[2] = 2;
    arr[3] = 1;
    arr[4] = 19;

    for(int i = 0; i < 5; i++)
    {
        printf("value at %d using pointer is: %d\n", i, *(pointer + i));
    }




    return 0;
}