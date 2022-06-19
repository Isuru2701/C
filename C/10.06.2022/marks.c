#include <stdio.h>

char Grading(float percent);
int main(void)
{
    float physics, chemistry;
    char physicsGrade, chemistryGrade;

    printf("enter physics marks: ");
    scanf("%f", &physics);

    printf("enter chemistry marks: ");
    scanf("%f", &chemistry);

    // converting to percentages
    physics = physics / 100;
    chemistry = chemistry / 100;

    physicsGrade = Grading(physics);
    chemistryGrade = Grading(chemistry);

    printf("physics grade is: %c\nchemistry grade is : %c", physicsGrade, chemistryGrade);
    return 0;
}

char Grading(float percent)
{
    if (percent >= 0.9)
    {
        return 'A';
    }
    else if (percent >= 0.8)
    {
        return 'B';
    }
    else if (percent >= 0.7)
    {
        return 'C';
    }
    else if (percent >= 0.6)
    {
        return 'D';
    }
    else if (percent >= 0.4)
    {
        return 'E';
    }
    else
    {
        return 'F';
    }
}