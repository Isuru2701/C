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
4,5

= 2,5 | 2
= 2,5 | 2
= 1,5 | 5
= 1,1 ---
=      20


*/
int LCM(int num1, int num2)
{
    int lcm = 1, num;
    while (num1 != 1 && num2 != 1)
    {
        if (checkisPrime(num))
        {
            if (num1 % num == 0)
            {
                num1 /= num;
                lcm *= num;
            }
            if (num2 % num == 0)
            {
                num2 /= num;
                lcm *=num;
            }
        }
        num++;
    }
    return lcm;
}

int HCF(int num1, int num2)
{

    return 0;
}

bool checkisPrime(int value)
{
    for (int i = 2; i < value; i++)
    {
        if (value % i == 0)
        {
            return false;
        }
    }
    return true;
}