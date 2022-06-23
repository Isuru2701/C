#include <stdio.h>

int main(void)
{
    int code;
    float sales;
    printf("enter code: ");
    scanf("%d", &code);

    printf("enter sales: ");
    scanf("%f", &sales);

    if (code == 1)
    {
        if (sales >= 10000)
        {
            printf("your bonus is $500");
        }
        else
        {
            printf("your bonus is $200");
        }
    }

    else if (code == 2)
    {
        if (sales >= 20000)
        {
            printf("your bonus is $600");
        }
        else
        {
            printf("your bonus is $550");
        }
    }
    else
    {
        printf("your bonus is $150");
    }

    return 0;
}