#include <stdio.h>

/*
The application is organized into three sub functions and the main function.
The tasks done by each function mentioned below.
You are allowed to decide type, name, and parameters of each function meaningfully.

    Function 1:
Gets vehicle number, distance travelled, and time taken by the vehicle and calculate the vehicle speed.

    Function 2:
Check the calculated vehicle speed and decide fine amount.
If vehicle speed exceeds 100, fine amount is 10000(LKR) and if it exceeds 70, fine amount is 2000(LKR).

    Function 3:
Output vehicle number and fine amount of the vehicle.

    Function main:
Call each function.

*/


//global variable for vehicle number of type int, because functions can't return multiple different types
//going for int cuz distance and time can be a float unless explicitly stated, which it is not.
//if u assume distance and time are ints, u can include this as a local variable in the GetInfo(void) function no worries.
int number;

void OutputDetails(float fine);
float CheckSpeed(float speed);
float GetInfo(void);

int main(void)
{

    OutputDetails(CheckSpeed(GetInfo()));    

    return 0;
}

float GetInfo(void)
{
    float distance, time, speed;

    printf("enter vehicle number: ");
    scanf("%d", &number);


    printf("enter distance travelled: ");
    scanf("%f", &distance);
    printf("enter time taken: ");
    scanf("%f", &time);

    speed = distance / time;

    return speed;

}

float CheckSpeed(float speed)
{
    if(speed > 100)
    {
        return 10000;
    }
    else if(speed > 70)
    {
        return 2000;
    }
    else 
    {
        return 0;
    }
}

void OutputDetails(float fine)
{
    printf("\nVehicle Number: %d\nFined amount: LKR%.2f", number, fine);
}
