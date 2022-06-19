#include <stdio.h>

int main()
{
    int code;
    float sales, bonus;

    printf("enter code: ");
    scanf("%d", &code);
    printf("enter sales: ");
    scanf("%f", &sales);

    if (code == 1)
    {
        if (sales >= 10000)
        {
            printf("bonus is $500\n");
            bonus = 500;
        }
        else
        {
            printf("bonus is $200");
            bonus = 200;
        }
    }
    else if (code == 2)
    {
        if (sales >= 20000)
        {
            printf("bonus is $600\n");
            bonus = 600;
        }
        else
        {
            printf("bonus is $550\n");
            bonus = 550;
        }
    }
    else
    {
        printf("bonus is $150\n");
        bonus = 150;
    }

    return 0;
}