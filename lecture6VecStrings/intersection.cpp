#include<bits/stdc++.h>
using namespace std;

int main(int argc,char** argv)
{
    vector<int> v1 {1,1,2,2,2,3,5};
    vector<int> v2 {1,1,1,2,2,4,5};

    int i=0,j=0;
    while(i<v1.size() && j< v2.size()){

        if(v1[i]==v2[j]){
            cout<<v1[i]<<" ";
            i++;
            j++;
        }

   if(v1[i]<v2[j]){
            i++;
        }

   if(v1[i]>v2[j]){
            j++;
        }
    }
}
