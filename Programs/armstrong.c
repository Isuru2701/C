#include <stdio.h>

/*
armstrong numbers are numbers which equal the sum of their individual digits
*/

// outputs the armstrong numbers from 1 to 500

/*
TODO
[] loop thru 500 numbers
[] check is armstrong
    [] while loop
    [] separate each digit using num%10
    [] add it's cube to sum
    [] remove the digit using num/10
[] IF num == sum output num
*/
int main(void)
{
    int num, sum, digit;
    for (int i = 1; i <= 500; ++i)
    {
        num = i;
        while (num > 0)
        {
            digit = num % 10;               // for example: 457 % 10 = 7,(cuz 457/10 = 45 remainder 7) like that we extract the digit
            sum += (digit * digit * digit); // cube it and add
            num = num / 10;                 // divide by 10 to remove the digit, we get rid of it so that in the next iteration the next digit is under scrutiny
                                            // we don't need to worry about decimal values resulting from this, cuz integers automatically drop anything on the rightside of the decimal point
        }
        if (sum == i)
        {
            printf("%d", i);
        }
    }

    return 0;
}