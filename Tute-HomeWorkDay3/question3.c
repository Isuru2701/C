#include <stdio.h>

int main(void)
{
    int arr[5] = {1,4,6,2,9};

    for (int i = 0; i < 5; i++)
    {
        printf("address of location %d is %x, value: %d", i, &arr[i], arr[i]);
    }

    return 0;

}