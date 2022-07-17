#include <stdio.h>

/*
Write a C program to find average of maximum of n positive numbers entered by user. But, 
if the input is negative, display the average (excluding the average of negative input) and end 
the program 
*/

int main(void)
{
    int n, sum = 0, num;

    printf("enter number of numbers: ");
    scanf("%d", &n);

    for(int i = 0; i < n; ++i)
    {
        printf("enter number: ");
        scanf("%d", &num);

        if (num > 0)
        {
            sum += num;
        }
        else if (num < 0)
        {
            break;
        }
    }
    
    return 0;
}