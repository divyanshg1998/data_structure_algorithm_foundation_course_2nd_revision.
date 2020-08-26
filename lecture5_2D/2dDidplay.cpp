#include <bits/stdc++.h>
using namespace std;

void func(int **arr, int r, int c)
{

    for (int j = 0; j < c; j++)
    {

        if (j % 2 == 0)
        {

            for (int i = 0; i < r; i++)
            {
                cout << arr[i][j] << " ";
            }
            cout << endl;
        }
        else
        {

            for (int i = r - 1; i >= 0; i--)
            {
                cout << arr[i][j] << " ";
            }
            //silly
            // i starts from i-1
            cout << endl;
        }
    }
}

int main(int argc, char **argv)
{

    int **arr = new int *[4];

    arr[0] = new int[4]{11, 12, 13, 14};
    arr[1] = new int[4]{21, 22, 23, 24};
    arr[2] = new int[4]{31, 32, 33, 34};
    arr[3] = new int[4]{41, 42, 43, 44};

    func(arr, 4, 4);
}