#include <stdio.h>

/*
Write a C program to find average of maximum of n positive numbers entered by user. But,
if the input is negative, display the average (excluding the average of negative input) and end
the program
*/

int main(void)
{
    int n, count = 0;
    float sum = 0, num;

    printf("enter number of numbers: ");
    scanf("%d", &n);

    do
    {
        printf("enter number: ");
        scanf("%f", &num);

        if (num > 0)
        {
            sum += num;
            ++count;
        }
        else if (num < 0)
        {
            break;
        }
    }while( count < n);

    printf("average of positive numbers (%d): %.2f", count, (sum / count));

    return 0;
}