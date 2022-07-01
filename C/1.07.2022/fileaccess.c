#include <stdio.h>
#include <time.h>

int main(void)
{

    // a program to enter data: record datetime, user input; name, age, address

    // time management:

    struct tm *tptr;
    time_t t;
    FILE *filepointer;
    char *name, *address;
    int age;

    filepointer = fopen("data.txt", "w");

    printf("enter name age and address: ");
    scanf("%s %i %s", &name, &age, &address);

    printf("age is:%i\n", age);
    t = time(NULL);
    tptr = localtime(&t);
    printf("%s", asctime(tptr));

    return 0;
}