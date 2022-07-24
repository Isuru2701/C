#include <stdio.h>
#include <string.h>
#include <math.h>

void DectoHex(char *code);
void HextoDec(char *code);

int main(void)
{
    char *code = "";
    int type;

    printf("enter 1 to convert from Dec to Hex\nenter 2 to convert from Hex to Dec\n");
    scanf(" %d", &type);
    printf("enter value to convert: ");
    scanf(" %s", code);

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

/*
    decimal to hex:
        120 = 120/16 -> 8 ^
                        7 |
        120_10 = 78_16

*/

void DectoHex(char *code)
{
    int dec = atoi(code), remainder = 0; // int atoi(str) converts a str to int
    char *hex;
    do
    {
        remainder = dec % 16;
        switch (remainder)
        {
        case 10:
            strncat(hex, 'A', 1);
            break;
        case 11:
            strncat(hex, 'B', 1);
            break;
        case 12:
            strncat(hex, 'C', 1);
            break;
        case 13:
            strncat(hex, 'D', 1);
            break;
        case 14:
            strncat(hex, 'E', 1);
            break;
        case 15:
            strncat(hex, 'F', 1);
            break;
        default:
            strncat(hex, &remainder, 1);
            break;
        }
        dec /= 16;
    } while (dec > 16);

    printf("Hex of %s_10 is %s_16", code, hex);
}

/*
    hex to decimal:
        78_16
        8 x 16^0 =   8
        7 x 16^1 = 112
                 ------
                   120
                ======

*/

void HextoDec(char *code)
{
    
}