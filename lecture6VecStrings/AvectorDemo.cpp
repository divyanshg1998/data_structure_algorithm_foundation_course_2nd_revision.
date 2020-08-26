#include <bits/stdc++.h>

using namespace std;

void filter1(vector<int> v)
{

    //new vector made
    for (int i = 0; i < v.size(); i++)
    {
        // size get changed simultaneously

        if (v[i] % 2 == 1)
        {
            v.erase(v.begin() + i);
            i--;
        }
    }

    for (int i = 0; i < v.size(); i++)
    {

        cout << v[i] << " ";
    }
    cout << endl;
}

void filter2(vector<int>& v)
{

    for (int i = v.size() - 1; i >=0 ; i--)
    {
        // size get changed simultaneously

        if (v[i] % 2 == 1)
        {
            v.erase(v.begin() + i);
        }
    }

    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
    }
    cout << endl;
}

int main(int argc, char** argv)
{

    vector<int> v{10, 20, 30, 31, 40, 42,33, 43, 50, 31};

    // filter1(v); //wrong

    // for(int i=0 ; i<v.size(); i++){

    //     cout<<v[i]<<" ";
    // }
    // cout<<endl;

    filter2(v);
    
    cout<<v.size()<<endl;
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
    }
    cout << endl;

    return 0;
}