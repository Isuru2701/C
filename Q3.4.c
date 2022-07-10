#include <stdio.h>

float * InputSpeeds(void);
int Fines(float *speeds);

int main(void)
{
    float *speeds;
    speeds = InputSpeeds();
    printf("Fines payable: %d", Fines(speeds));

    return 0;
}

float * InputSpeeds(void)
{
    static float speeds[10];
    for (int i = 0; i < 10; ++i)
    {
        scanf("%f", &speeds[i]);
    }
    return speeds;
}

int Fines(float *speeds)
{

    int fine = 0;
    for (int i = 0; i < 10; ++i)
    {
        if (*(speeds + i) > 100)
        {
            fine += 500;
        }
    }
    return fine;
}
