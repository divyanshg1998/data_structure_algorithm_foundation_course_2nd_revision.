#include<bits/stdc++.h>
using namespace std;

int main(){

vector<int> v;
v.push_back(10);

v.push_back(39);
v.push_back(20);

v.insert(v.begin()+3,78);

for(auto itr: v){
    cout<< itr<<" ";
}
cout<<endl;

v.erase(v.begin()+1);

for(auto itr: v){
    cout<< itr<<" ";
}
cout<<endl;

}
