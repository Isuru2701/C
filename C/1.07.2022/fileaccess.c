#include <stdio.h>
#include <time.h>

void ReadFile(char *file);

int main(void)
{

    // a program to enter data: record datetime, user input; name, age, address
    ReadFile("data.txt");
    return 0;
}

void ReadFile(char *file)
{
    // time management:

    struct tm *tptr;
    time_t t;
    FILE *filepointer;
    char name[20], address[20], buffer[80];
    int age;

    printf("My name is: %s\n", name);

    filepointer = fopen(file, "a");

    printf("enter name age and address: ");
    scanf("%s %i %s", name, &age, address);

    printf("name: %s | age: %i | address: %s\n", name, age, address);

    // time
    t = time(NULL);
    tptr = localtime(&t);
    strftime(buffer, 80, "%d_%m_%Y_%I:%M%p", tptr);
    printf("%s\n", buffer);

    fprintf(filepointer, "%s %s %i %s\n", buffer, name, age, address);

    fclose(filepointer);
}