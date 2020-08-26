#include<bits/stdc++.h>
using namespace std;

vector<string> func(vector<int> arr, int i){

if(i==arr.size()-1){
vector<string> v;
v.push_back("");
return v;
}

vector<string> mres;
for( int j=1; j<= arr[i] && i+j < arr.size(); ++j){
    
    vector<string> rres= func(arr, i+j);
    for(int k=0; k < rres.size(); ++k){
        mres.push_back( to_string(j) + " "+ rres[k]);
    }

}
return mres;

}

// vector<string> sp(vector<int> v, int ind){

// vector<
// for(int i=1 ; i <= v[ind] && ind+i<v.size() ; i++)
// {



// }

// }

int main(int argv, char** argc){

vector<int> v {3,2,0,4,1,2,0,2,3,0,1};

vector<string> v2= func(v,0);
for(auto itr: v2){
    cout<<itr<<endl;
}
cout<<v2.size()<<endl;

//func to find the list of all the shortest path from 0 to v.size() , just like in dp
// vector<string> v4= sp(v,0);
// for(auto itr: v4){
//     cout<<itr<<endl;
// }
// cout<<v4.size()<<endl;

return 0;
} 