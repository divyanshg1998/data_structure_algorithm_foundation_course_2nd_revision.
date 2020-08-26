#include<bits/stdc++.h>
using namespace std;

int func(vector<int>& arr, int vidx, int sum, vector<int>& ans)
{

// levels and options

if(vidx == arr.size()){

    if( sum == 0)
    {
        for(int i=0; i< ans.size(); i++){
        cout<<ans[i]<<" ";
    }
    cout<<endl;
    return 1;
    }
    return 0;
}

int n1=0, n2=0, n3;
if(sum - arr[vidx] >= 0){
    ans.push_back(arr[vidx]);
    int n1=func(arr, vidx+1, sum-arr[vidx], ans);
    ans.pop_back();    
}

if(sum>=0){

    int n2=func(arr, vidx+1, sum, ans);
    }

n3=n1+n2;

return n3;

}

int main(){

vector<int> v{10,20,30,40,50,60,70,80,90,100};
vector<int> ans;
cout<<func( v, 0, 90, ans);

    return 0;
}