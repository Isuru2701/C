#include <stdio.h>
#include <time.h>

int main(void)
{

    // a program to enter data: record datetime, user input; name, age, address

    // time management:

    struct tm *tptr;
    time_t t;
    FILE *filepointer;
    char name[20], address[20];
    int age;

    printf("My name is: %s\n", name);

    filepointer = fopen("data.txt", "w");

    printf("enter name age and address: ");
    scanf("%[^\n]%*c %i %[^\n]%*c", name, &age, address);

    printf("name is: %s\n", name);
    t = time(NULL);
    tptr = localtime(&t);
    printf("%s", asctime(tptr));


    fclose(filepointer);

    return 0;
}