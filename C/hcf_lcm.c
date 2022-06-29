#include <stdio.h>
#include <stdbool.h>

int LCM(int num1, int num2);
int HCF(int num1, int num2);
bool checkisPrime(int value);

/*

The Least Common Multiple of two or more numbers
 is the smallest number among all common multiples of the given numbers.



The Highest Common Factor (HCF) of two numbers is
 the highest possible number which divides both the numbers completely.
*/

int main(void)
{

    int num1, num2;
    printf("enter number 1: ");
    scanf("%d", &num1);

    printf("enter number 2: ");
    scanf("%d", &num2);

    printf("LCM is: %d\nHCF is: %d", LCM(num1, num2), HCF(num1, num2));

    return 0;
}

/*
The Least Common Multiple of two or more numbers
 is the smallest number among all common multiples of the given numbers.

*/
int LCM(int num1, int num2)
{

    int max = (num1 > num2) ? num1 : num2;

    while (1)
    {
        if (max % num1 == 0 && max % num2 == 0)
        {
            return max;
        }
        max++;
    }
}
/*
The Highest Common Factor (HCF) of two numbers is
 the highest possible number which divides both the numbers completely.

20, 16

10,8 | 2
5,4  | 2


*/
int HCF(int num1, int num2)
{
    while (num1 != num2)
    {
        if (num1 > num2)
            num1 -= num2;
        else
            num2 -= num1;
    }
    return num1;
}

bool checkisPrime(int value)
{
    for (int i = 2; i < value; ++i)
    {
        if (value % i == 0)
        {
            return false;
        }
    }
    return true;
}