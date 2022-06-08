/*Question: 
Input hourly fee of a worker and number of hours which he worked in the last month.
Then output income of the worker for the last month.*/


/*
Isuru Yahampath
  codse221f-044
  codse221f-044@student.nibm.lk

*/

#include <stdio.h>

int main() {

    float rate; //rate can be a floating point as well
    float hours; //using float instead of int because it allows entering values like 30mins -> 0.5hrs

    float income; //rate multiplied by hours could result in a float


    //date entry
    printf("enter hourly fee of worker: ");
    scanf("%f", &rate);
    printf("enter hours worked in a month: ");
    scanf("%f", &hours);

    //calculation
    income = rate * hours;

    //display
    printf("income of the worker for the month is: %.2f", income);

    return 0;

}