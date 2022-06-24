#include <stdio.h>
/*

Input temperature values of 10 districts in Sri Lanka into an array and output followings.
    Outputs	:	average temperature value.
                Minimum temperature value.
                Maximum temperature value.

*/
int main(void)
{
    float temperatures[10], totTemp = 0;
    int maxTemp = 0, minTemp = 0;

    for (int i = 0; i < 10; i++)
    {
        printf("enter temperature for area %i: ", i + 1);
        scanf("%f", &temperatures[i]);

        totTemp += temperatures[i];

        if (temperatures[i] > temperatures[maxTemp])
        {
            maxTemp = i; //sets location for next iteration
        }
        else if (temperatures[i] < temperatures[minTemp])
        {
            minTemp = i; //sets location for next iteration
        }
    }
    
    printf("Average temperature is: %.1f\nmax temperature is: %.1f\nmin temperature is: %.1f", totTemp / 10, temperatures[maxTemp], temperatures[minTemp]);

    return 0;
}