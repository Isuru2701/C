#include <stdio.h>

/*

    fibonacci sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
                        ^  ^  ^
                    (n-2) (n-1) (n)
*/

int main(void)
{
    int limit, n = 1, n_1 = 1, n_2 = 0;

    printf("enter maximum number: ");
    scanf("%d", &limit);

    while (n < limit)
    {
        printf("%d,", n);
        n = n_1 + n_2;
        n_2 = n_1;
        n_1 = n;
    }
    printf("%d", n);

    return 0;
}