#include <stdio.h>

int main(void)
{
    int username, password;

    while (1)
    {
        printf("enter username: ");
        scanf("%d", &username);
        printf("enter password: ");
        scanf("%d", &password);

        if (username == 123 && password == 123)
        {
            printf("You have successfully logged in as admin");
        }
        else
        {
            printf("Enter correct username and password");
        }

    }
    return 0;
}