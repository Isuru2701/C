#include <stdio.h>
#include <string.h>

int main(void)
{
    char *code = "";
    int type;

    printf("enter 1 to convert from Dec to Hex\nenter 2 to convert from Hex to Dec\n");
    scanf("%d", &type);
    printf("enter value to convert: ");
    scanf("%s", code);

    switch (type)
    {
    case 1:
        DectoHex(code);
        break;

    case 2:
        HextoDec(code);
        break;
    }

    return 0;
}

void DectoHex(char *code)
{
    /*
        decimal to hex:
            120 = 120/16 -> 8 ^
                            7 |
            120_10 = 78_16
                  
    */
    int dec = (int)code;
    char *hex;
    for (int i = 0; i < strlen(code); ++i)
    {
        
    }
}