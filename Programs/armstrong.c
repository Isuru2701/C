#include <stdio.h>

/*
armstrong numbers are numbers which equal the sum of their individual digits,
output the armstrong numbers from 1 to 500
*/


/*
approach:

[] loop thru 500 numbers
[] check isArmstrong?:
    [] while loop
        [] separate each digit using num%10
        [] add it's cube to sum
        [] remove the digit using num/10
[] IF num == sum output num
*/

int main(void)
{
    int num, sum = 0, digit, count = 1;
    do
    {
        num = count; // we are going to do some destructive arithemitc, so we need to preserve the initial value for comparison
        while (num > 0)
        {
            digit = num % 10;                    // for example: 457 % 10 = 7,(cuz 457/10 = 45 remainder 7) this is the way that we extract a digit
            sum = sum + (digit * digit * digit); // cube digit and add to sum
            num = num / 10;                      // divide by 10 to remove the digit, we get rid of it so that in the next iteration the next digit is under scrutiny
                                                 // we don't need to worry about decimal values resulting from this, cuz integer-types automatically drop anything on the rightside of the decimal point
        }
        if (sum == count) //self-explanatory :)
        {
            printf("%d\n", count);
        }
        count++;

        sum = 0; //reset sum to zero for next iteration
    } while (count < 500); //u can use a for loop, while loop, or a do while. I use do-while cuz i prefer that one.

    return 0;
}