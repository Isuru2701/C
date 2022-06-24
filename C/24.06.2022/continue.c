#include <stdio.h>

int main(void)
{
    int num;

    for (int i = 0; i < 6; i++)
    {
        if (i == 3)
        {
            continue; //skips the rest of the code for which this condition is true
        }
        printf("number %d", i);
    
    }
    return 0;
}