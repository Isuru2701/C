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


    printf("address of n[0] using n is: %i\n", &n);
    printf("value of n[0] using n is: %i\n\n", n[0]);

    printf("address of n[0] using q pointer is: %i\n", q);
    printf("value of n[0] using q pointer is: %i\n", *q);
    printf("%i\n",c);

    /*operators*/
    
    //arithmetic
    int n1, n2;
    printf("enter value for n1: ");
    scanf("%d", &n1);
    printf("enter value for n2: ");
    scanf("%d", &n2);
    printf("value of n1 mod n2 = %d\n", n1 % n2);

    //relational
    printf("relation n1 < n2 is %d\n", n1 < n2);
    printf("relation n1 is equal to n2 is %d\n", n1 == n2);
    printf("relation n1 not equal to n2 is %d\n", n1 != n2);

    //logical
    printf("relation n1 greater than n2 AND n2 is equal to 20 is %d\n", (n1 > n2) && (n2 == 20));
    printf("relation n1 greater than n2 OR n2 is equal to 20 is %d\n", (n1 > n2) || (n2 == 20));
    printf("relation n1 is NOT greater than n2 is  is %d\n", !(n1 > n2));
  

    return 0;

}