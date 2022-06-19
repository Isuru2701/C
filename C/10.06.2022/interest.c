#include<stdio.h>

int main(void)
{
    char type;
    float balance;

    printf("enter type of account(c/y/s): ");
    scanf(" %c", &type);

    printf("enter account balance: ");
    scanf(" %f", &balance);

    /*

    there is a bug in C where the final scanf may not await for the user input and skip onto the code below
    to fix this, simply leave a space before the format specifier

    */

    switch (type)
    {
    case 'c':
        printf("rate: 5%%\n");
        printf("interest amount is: %.2f", balance * 0.05);
        break;

    case 'd':
        printf("rate: 9%%\n");
        printf("interest amount is: %.2f", balance * 0.09);
        break;

    case 'y':
        printf("rate: 13%%\n");
        printf("interest amount is: %.2f", balance * 0.13);
        break;

    default:
        printf("invalid account type");
    }

    return 0;
}