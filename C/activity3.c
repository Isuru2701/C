#include <stdio.h>

int main(void)
{

    float bill;

    printf("enter bill amount: ");
    scanf("%f", &bill);

    if (bill > 30000) //bill > 30000
    {
        printf("discount rate is: 8%%\n");
        printf("discount amount is: %.2f\n", bill * 0.08);
        printf("discounted bill amount is %.2f\n", bill - (bill * 0.08));
    }
    else if (bill > 25000) // 25000 < bill < 30000
    {
        printf("discount rate is: 5%%\n");
        printf("discount amount is: %.2f\n", bill * 0.05);
        printf("discounted bill amount is %.2f\n", bill - (bill * 0.05));
    }
    else if (bill > 15000) // 15000 < bill < 25000
    {
        printf("discount rate is: 3%%\n");
        printf("discount amount is: %.2f\n", bill * 0.03);
        printf("discounted bill amount is %.2f\n", bill - (bill * 0.03));
    }
    else
    {
        printf("bill amount is not eligible for a discount");
    }
    return 0;
}