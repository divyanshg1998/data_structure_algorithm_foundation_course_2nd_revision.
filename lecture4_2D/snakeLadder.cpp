#include <bits/stdc++.h>

using namespace std;

void func(int **arr, int r, int c, int i, int j)
{

    int dxn = 0;

    while (true)
    {

        //silly mistake
        //we can exit the maze from any side of the four sides
        //i.e. also when i>=0  && j>=0

        dxn %= 4;

        if (dxn == 0)
        {
            j++;
            if (j == c)
            {
                cout << "position:" << i << " " << j - 1 << endl;
                break;
            }
        }
            else if (dxn == 1)
            {
                i++;
                if (i == r)
                {
                    cout << "position:" << i - 1 << " " << j << endl;
                    break;
                }
            }
            else if (dxn == 2)
            {
                j--;
                if (j == -1)
                {
                    cout << "position:" << i << " " << j + 1 << endl;
                    break;
                }
            }
            else
            {
                i--;
                if (i == -1)
                {
                    cout << "position:" << i + 1 << " " << j << endl;
                    break;
                }
            }

            dxn = dxn + arr[i][j];

            // if(arr[i][j]==1)
            //     dxn++;
        }
    }


    int main(int argc, char **argv)
    {

        int **arr = new int *[4];
        arr[0] = new int[4]{0, 0, 1, 0};
        arr[1] = new int[4]{1, 0, 0, 0};
        arr[2] = new int[4]{0, 0, 0, 0};
        arr[3] = new int[4]{1, 0, 1, 0};

        func(arr, 4, 4, 0, 0);

        return 0;
    }