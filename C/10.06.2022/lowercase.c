#include <stdio.h>

int main(void)
{
    char c;
    printf("enter character: ");
    scanf("%c", &c);

    if(c >= 'A' && c <='Z')
    {
        printf("character is in uppercase");
    }
    else if(c >= 'a' && c<='z')
    {
        printf("character is in lowercase");
    }
    else
    {
        printf("character is not a letter");
    }
}