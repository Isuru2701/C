#include <stdio.h>

int main()
{
    float numbers[10], sum = 0;


    for(int i = 0; i < 10; i++)
    {
       printf("enter number: ");
       scanf("%f", &numbers[i]); 
       sum += numbers[i];
    }
    printf("average is: %f", sum/10);
}