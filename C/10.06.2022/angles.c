#include <stdio.h>

int main(void)
{
    float angle1, angle2, angle3;
    printf("enter the angles: ");
    scanf("%f%f%f", &angle1, &angle2, &angle3);

    if (angle1 + angle2 + angle3 == 180)
    {
        printf("triangle is valid");
    }
    else
    {
        printf("triangle is not valid");
    }

    return 0;
}