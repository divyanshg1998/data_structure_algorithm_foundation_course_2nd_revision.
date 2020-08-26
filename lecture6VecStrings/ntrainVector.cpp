#include<bits/stdc++.h>
using namespace std;

int main(int** argc, char argv){

vector<int> v{10, 20, 30, 40, 50, 60, 70, 80, 90};

int ws=5;
int we=7;

for (int i=0; i< v.size(); i++){

    for(int i=ws; i<=we ; i++){
        cout<<v[i]<<" ";
    }
       cout<<endl;
/*  */

    int val=v.back();
    v.pop_back();
    v.insert(v.begin(), val);
}

    return 0;
}