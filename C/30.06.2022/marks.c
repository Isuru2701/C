#include <stdio.h>

int main(void)
{

    int id;
    char name[20];
    float marks;

    FILE *pointer;
    do
    {
        printf("enter id: ");
        scanf("%d", &id);

        if(id == 9999)
        {
            break;
        }
        printf("enter name: ");
        scanf("%s", name);
        printf("enter average marks: ");
        scanf("%f", &marks);

        pointer = fopen("marks.txt", "a");

        fprintf(pointer, "%d %s %.1f\n", id, name, marks);
    } while (1);

    fclose(pointer);

    return 0;
}