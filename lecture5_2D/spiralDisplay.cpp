#include <bits/stdc++.h>
using namespace std;

void func(int **arr, int r, int c)
{

    int cbeg = 0, rbeg = 0, cend = c - 1, rend = r - 1, ctr = 1;

    while (ctr < r * c)
    {
   
        for (int i = rbeg; i <= rend; i++)
        {

            cout << arr[i][cbeg] << " ";
            ctr++;
        }
        cbeg++;

        for (int j = cbeg; j <= cend; j++)
        {
            cout << arr[rend][j] << " ";
            ctr++;
        }
        rend--;

        for (int i = rend; i >= rbeg; i--)
        {

            cout << arr[i][cend] << " ";
            ctr++;
        }
        cend--;

        for (int k = cend; k >= cbeg; k--)
        {

            cout << arr[rbeg][k] << " ";
            ctr++;
        }
        rbeg++;
}}

int main(int argv, char **argc)
{

    int **arr = new int *[4];
    arr[0] = new int[5]{11, 12, 13, 14, 15};
    arr[1] = new int[5]{21, 22, 23, 24, 25};
    arr[2] = new int[5]{31, 32, 33, 34, 35};
    arr[3] = new int[5]{41, 42, 43, 44, 45};
    func(arr, 4, 5);

    return 0;
}