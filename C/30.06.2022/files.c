#include <stdio.h>

int main(void)
{

    // file type pointer - stores memory address of a file loaded to memory

    FILE *filepointer;

    filepointer = fopen("number.txt", "w");
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
        printf("file address %x", filepointer);
    }

    for (int i = 1; i <= 10; ++i)
    {
        // fprintf(<pointer>, "<string>", <values>);
        fprintf(filepointer, "%d\n", i);
    }

    fclose(filepointer);
    return 0;
}