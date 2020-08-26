#include <bits/stdc++.h>
using namespace std;

int counter=0;
void fun(int cb, int n,
         int isf, int r, string asf, vector<bool>& items)
{
    // isf==item so far
    // cb= curr box

    if (cb == n)
    {
        if (isf == r)
        {
            cout << asf << endl;
            counter++;
        }
        return;
    }

    fun(cb + 1, n, isf, r, asf, items);

    for (int i = 0; i < items.size(); i++)
    {

        if (items[i] == false)
        {
            items[i] = true;
            fun(cb + 1, n, isf + 1, r, asf + to_string(isf) + " " + to_string(cb) + "  ", items);
            items[i] = false;
        }
    }
}

int main()
{
    // case 2
    // levels and options swapped here
    // levels=boxes 
    //    options = objects(1,2)

    int n = 4;
    int r = 2;
    vector<bool> v(2, false);

    // for(auto itr: v){
    //     cout<< itr<<endl;
    // }

    fun(0, n, 0, r, "", v);
    cout<<counter<<endl;
    return 0;
}