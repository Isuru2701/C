#include <stdio.h>

int main(void)
{
    float amount, profit;

    printf("enter amount invested(millions): ");
    scanf("%f", &amount);
    
    printf("enter profit of the company(millions): ");
    scanf("%f", &profit);

    // values entered in terms of millions
    if (amount < 6)
    {
        printf("share: %.2f", profit * 0.02);
    }
    else if (amount >= 6 && amount < 10)
    {
        printf("share: %.2f", profit * 0.05);
    }
    else
    {
        printf("share: %.2f", profit * 0.08);
    }
    return 0;
}