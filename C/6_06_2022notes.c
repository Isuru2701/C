#include <stdio.h>

int main(void)

{

    int a[5];
    int *g;

    int x = 2, z = 20;
    int* y;

    int q = 10,w = 2,e;
    e = q++ + q - --w + q;


    printf("%d\n", e);

    

    x =  z; ++x;
    printf("%d\n", z = z + 1);

    int b = 10, d = 5;
    printf("%d\n", ++b, b++);

    printf("%d\n", d = d + 1, d = d + 2); 


    y = &x;
    printf("%x\n", y);

    y = &x;

    printf("%x\n\n", y);

    g = a;

    a[0] = 1, a[1] = 2, a[2] = 3, a[3] = 4, a[4] = 5;

    printf("address is %x\n", g);
    printf("value is %d\n", *g);
    printf("address is %x\n", g+1);
    printf("value is %d\n", *g+1);
    printf("address is %x\n", g+2);
    printf("value is %d\n", *g+2);
    printf("address is %x\n", g+3);
    printf("value is %d\n", *g+3);
    printf("address is %x\n", g+4);
    printf("value is %d\n", *g+4);

    return 0;
}