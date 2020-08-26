#include <bits/stdc++.h>
using namespace std;
void getSubSequance(string qu, string ans)
{

    if (qu.length() == 0)
    {
        cout << ans << endl;
        return;
    }

    char ch = qu[0];
    string ros = qu.substr(1, qu.length() - 1);

    getSubSequance(ros, ans + ch);
    getSubSequance(ros, ans + "-");
}

int ctr = 0;

void printStairPath(int src, string psf)
{
    if (src == 0)
    {
        cout << psf << endl;
        ctr++;
        return;
    }

    for (int j = 1; j <= 3; j++)
    {
        if (src - j >= 0)
            printStairPath(src - j, psf + to_string(j));

        else
            break;
    }
}

string codes[] = {
    "",
    "abc",
    "def",
    "ghi",
    "jklm",
    "no",
    "pqrs",
    "tu",
    "vwxy",
    "ez"};

int ctr1=0;
void keypadSoln(string str, string psf)
{
    // 
    if (str.length() == 0)
    {
        cout << psf << endl;
        ctr1++;
        return;
    }

    char ch = str[0];
    string roq = str.substr(1, str.length() - 1);
    int j = (int)(ch - 48);


    string res = codes[j];
    for (int i = 0; i < res.length(); i++)
    {
        keypadSoln(roq, psf + res[i]);
    }
}

int ctr2 = 0;
void printStairPath2(vector<int> v, int i, string psf)
{
    if (i == v.size() - 1)
    {
        cout << psf << endl;
        ctr2++;
        return;
    }

    for (int j = 1; j <= v[i]; j++)
    {
        if (i + j < v.size())
            printStairPath2(v, i + j, psf + to_string(j));
        else
            break;
    }
}

int ctr3 = 0;
void mazepath(int sr, int sc, int dr, int dc, string psf)
{
        if (sr == dr && sc == dc)
    {
        cout << psf << endl;
        ctr3++;
        return;
    }

    if (sr + 1 <= dr)
    {
        mazepath(sr + 1, sc, dr, dc,  psf+ "V" );
    }

    if (sc + 1 <= dc)
    {
        mazepath(sr, sc + 1, dr, dc,  psf+"H" );
    }
}

int ctr4 = 0;
void mazepath2(int sr, int sc, int dr, int dc, string psf)
{
    if (sr == dr && sc == dc)
    {
        cout << psf << endl;
        ctr4++;
        return;
    }

    for (int st = 1; sr + st <= dr; st++)
    {
        mazepath2(sr + st, sc, dr, dc, psf + "V" + to_string(st) + " ");
    }

    for (int st = 1; sc + st <= dc; st++)
    {
        mazepath2(sr, sc + st, dr, dc, psf + "H" + to_string(st) + " ");
    }

    for (int st = 1; sc + st <= dc && sr + st <= dr; st++)
    {
        mazepath2(sr + st, sc + st, dr, dc, psf + "D" + to_string(st) + " ");
    }

}

int main()
{

    // all the same ques done in recursion 
    // are done here with a more powerful approach her
    // levels and options


    getSubSequance("abc","");  //ques and ans

    // printStairPath(7,"");
    // cout<<"paths"<<ctr;

    // keypadSoln("835", "");
    // cout<<ctr1;

    //  vector<int> v {3,2,0,4,1,2,0,2,3,0,1};//to reach till end and can take only as
    // //   much steps as each element in array
    //  printStairPath2(v,0,"");
    //  cout<<"paths"<<ctr2;

    // mazepath(0,0,3,3,"");
    // cout<<ctr3<<endl;

    // mazepath2(0,0,2,2,"");
    // cout<<ctr4<<endl;

    return 0;
}