#include <stdio.h>

int main(void)
{
    char value;

    printf("enter value: ");
    scanf("%c", &value);

    int count = 0;
    while(count < 8)
    {
        printf("%c\n", value);
        count++;
    }
    
    return 0;
}