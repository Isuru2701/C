#include <stdio.h>

int Permute(int n, int r);

int main(void)
{
    int n, r, ans;

    printf("enter n and r: ");
    scanf("%d %d", &n, &r);

    ans = Permute(n, r);

    printf("Permutation of %d and %d is %d", n, r, ans);

    ans = Combine(n, r);

    printf("Combination of %d and %d is %d", n, r, ans);
}

/*

nPr = n!/(n-r)!

 n(n-1)(n-2)..(n-n)/(n - r)!

 5P2 = 5!/(5-2)!
     = 5x4x3x2x1/3x2x1

*/

int Permute(int n, int r)
{
    int p = 1;
    for (int i = n; i > (n - r); --i)
    {
        p *= i;
    }
    return p;
}

int Combine(int n, int r)
{
    int c = Permute(n, r);
    int rfact = 1;
    for (int i = r; i > 0; --i)
    {
        rfact *= i;
    }

    c /= rfact;

    return c;
}