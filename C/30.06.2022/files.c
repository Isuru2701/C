#include <stdio.h>

int main(void)
{

    //file type pointer - stores memory address of a file loaded to memory

    FILE *filepointer;

    filepointer = fopen("number.txt", "w");
                  //fopen("<filename.<filetype>", "<file mode>")
                  //w - creates file, overwrites any existing file with same name
                  //r - read
                  //a - writing at the end of the file
                  //r+ - update (writing and reading)
                  //w+ - creates file for update, if if already exits, discards current contents
                  //a+ - open/create a file for update, written to end of file

         

    return 0;
}