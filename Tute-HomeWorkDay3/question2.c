#include <stdio.h>

int main(void)
{
    
    int arr[10], sum = 0;

    //reusing contents from question 1
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
        sum = sum + arr[i];
    }

    printf("sum of values in array is: %d", sum);

    return 0;

}