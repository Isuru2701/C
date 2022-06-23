#include <stdio.h>

int main(void)
{
    int arr[3]; 
    int product = 1;

    // printf("enter values for the array");
    // scanf("%d %d %d", &arr[0], &arr[1], &arr[2]);

    // product = arr[0] * arr[1] * arr[2];

    for (int i = 0; i < 3; i++)
    {
        printf("enter value for location %d: ", i);
        scanf("%d", &arr[i]);
        product = product * arr[i];
    }

    printf("multiplication is: %d", product);

    return 0;
}