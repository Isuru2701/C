#include <stdio.h>
#include <stdlib.h>

#define c 50 

int main() {

    int n[2];
    n[0] = 50;
    n[1] = 4;

    int d = 30;

    int *t; //pointer variable
    int *q;
    
    t = &d;
    q = n; //addressing an array requires no &


    printf("value 1 is %i\n", n[0]);
    printf("value 2 is %i\n", n[1]);

    
    printf("the memory address of the value d is: %x\n", t);
    printf("value of d using pointer: %i\n", *t);

    printf("address of n[0] using q pointer is: %i", q);
    printf("value of n[0] using q pointer is: %i", *q);
    printf("%i",c);

    return 0;

}