#include <stdio.h>

int main(void)
{

    float units = 0, charges = 0;

    printf("enter number of units consumed: ");
    scanf("%f", &units);

    charges = units * 0.5;
    printf("units: %.2f\n",units);

    if (units <= 50)
    {
        charges = units * 0.5;
    }
    else if (51 < units <=150)
    {
        charges = 50 * 0.5 + (units - 50) * 0.75;
    }
    else if (151 < units <= 250)
    {
        charges = 50 * 0.5 + 100 * 0.75 + (units - 150) * 1.2;
    }
    else
    {
        charges = 50 * 0.5 + 100 * 0.75 + 100 * 1.2 + (units - 250) * 1.5;
    }

    //surcharge
    charges = charges * 1.2;

    printf("the amount payable is: %.2f", charges);


    return 0;
}