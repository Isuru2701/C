#include <stdio.h>

int main(void)
{
    float marks;

    printf("enter mark: ");
    scanf("%f", &marks);

    if (marks >= 60)
    {
        printf("You Passed!");
    }
    else
    {
        printf("You Failed!");
    }

    return 0;
}