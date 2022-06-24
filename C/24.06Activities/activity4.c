#include <stdio.h>

/*
Input unit prices and quantities bought of five items and output final bill amount (After discount).
If the bill amount is greater that 10,000(LKR),
6% discount rate is applied from the bill amount.
*/

int main(void)
{

    float price, bill = 0;
    int quantities;

    for(int i = 0; i < 5; i++)
    {
        printf("%d. enter price: ", i+1);
        scanf(" %f", &price);
        printf("   enter quantity: ");
        scanf(" %d", &quantities);

        bill += price * quantities;
    }
    if(bill > 10000)
    {
        printf("\nfinal bill amount %.2f", bill * 0.94); //discount of 6% is 100 - 6 = 94% => 0.94
      
    }
    else
    {
        printf("\nfinal bill amount %.2f", bill);
    }

    return 0;
}