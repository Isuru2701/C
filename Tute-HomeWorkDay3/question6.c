#include <stdio.h>

int main(void)
{
     // assuming 'n elements' in question 6 allows for an arbitrary size
    int arr[5] = {23, 3, 2, 1, 19};
    int *pointer;

    pointer = arr;

    for (int i = 0; i < 5; i++)
    {
        printf("value at %d using pointer is: %d\n", i, *(pointer + i));
    }

    return 0;
}