/*
Write a program to return the addition, multiplication, minimum, maximum and average
of given three integers. (Write separate functions for each operation)
*/

#include <stdio.h>

int main(void)
{
    int arr[] = {3, 4, 6};

    printf(" addition: %.2f\n multiplication: %.2f\n minimum: %d\n maximum: %d\n average: %d", addition(arr), multiplication(arr), minimum(arr), maximum(arr), average(arr));
}

addition(int *list)
{
    int i = 0, sum = 0;
    while (*(list + i) != NULL)
    {
        sum += *(list + i);
        ++i;
    }
    return sum;
}
multiplication(int *list)
{
    int i = 0, product = 0;
    while (*(list + i) != NULL)
    {
        product *= *(list + i);
        ++i;
    }
    return product;
}
minimum(int *list)
{
    int i = 0, min = *(list + i);
    ++i;
    while (*(list + i) != NULL)
    {
        if (*(list + i) < min)
        {
            min = *(list + i);
        }
    }
    return min;
}
maximum(int *list)
{
    int i = 0, max = *(list + i);
    ++i;
    while (*(list + i) != NULL)
    {
        if (*(list + i) < max)
        {
            max = *(list + i);
        }
    }
    return max;
}
average(int *list)
{
    int i = 0;
    while(*(list + i) != NULL)
    {
        ++i;
    }
        return addition(list) / i;
}
