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

int GetInfo(void);
float CheckSpeed(float speed);
void OutputDetails(int number, float fine);

int main(void)
{
    
    return 0;
}

int GetInfo(void)
{
    float distance, time, speed;
    int vehicleNumber;
    printf("enter vehicle number: ");
    scanf("%i", &vehicleNumber);

    printf("enter distance travelled: ");
    scanf("%f", &distance);
    printf("enter time taken: ");
    scanf("%f", &time);

    speed = distance / time;

    return vehicleNumber, speed;
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
}

void OutputDetails(int number, float fine)
{

    printf("vehicle number %d\nfine: %.2f",number, fine);

}