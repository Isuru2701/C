#include <stdio.h>

int main(void)
{
    int arr[5];

    arr[0] = 2;
    arr[1] = 21;
    arr[2] = 53;
    arr[3] = 65;
    arr[4] = 1;

    for (int i = 0; i < 5; i++)
    {
        printf("address of location %d is %x\n", i, &arr[i]);
    }

    return 0;

}