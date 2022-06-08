#include <stdio.h>

int main(void)
{
    int arr[10];

    arr[0] = 2;
    arr[1] = 21;
    arr[2] = 53;
    arr[3] = 65;
    arr[4] = 1;
    arr[5] = 62;
    arr[6] = 8;
    arr[7] = 0;
    arr[8] = 9;
    arr[9] = 32;

    for (int i = 0; i < 10; i++)
    {
        printf("value in index %d is %d\n", i, arr[i]);
    }

    return 0;

}