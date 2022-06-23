#include <stdio.h>

int main(void)
{
    float mark;

    printf("enter mark: ");
    scanf("%f", &mark);

    if (mark < 40)
    {
        printf("Grade: F");
    }
    else if (mark < 55)
    {
        printf("Grade: C");
    }
    else if (mark < 70)
    {
        printf("Grade: B");
    }
    else if (mark < 80)
    {
        printf("Grade: A");
    }
    else
    {
        printf("Invalid Mark entered");
    }

    return 0;
}