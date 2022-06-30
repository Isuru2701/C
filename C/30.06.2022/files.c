#include <stdio.h>

int main(void)
{

    // file type pointer - stores memory address of a file loaded to memory

    FILE *filepointer;
    char name[20];
    int age;

    filepointer = fopen("logs.txt", "a");
    // fopen("<filename.<filetype>", "<file mode>")
    // w - creates file, overwrites any existing file with same name
    // r - read
    // a - writing at the end of the file
    // r+ - update (writing and reading)
    // w+ - creates file for update, if if already exits, discards current contents
    // a+ - open/create a file for update, written to end of file

    if (filepointer == NULL) // check if the file is created
    {
        printf("File does not exist");
        return 0;
    }
    else
    {
        printf("File exists\n");
        printf("file address %x\n", filepointer);
    }

    // fprintf(<pointer>, "<string>", <values>);
    printf("enter name and age: ");
    scanf("%s %d", &name, &age);

    fprintf(filepointer, "%s %d\n", name, age);

    fclose(filepointer);



    filepointer = fopen("logs.txt", "r");
    if (filepointer == NULL) // check if the file is created
    {
        printf("File does not exist");
        return 0;
    }
    else
    {
        printf("File exists\n");
        printf("file address %x\n", filepointer);
    }

    char nameinfile[20];
    int ageinfile;
    while (!feof(filepointer))
    {
        fscanf(filepointer, "%s %d", nameinfile, &ageinfile);
        printf("name: %s\t age: %d\n", nameinfile, ageinfile);
    }
    fclose(filepointer);
    return 0;
}