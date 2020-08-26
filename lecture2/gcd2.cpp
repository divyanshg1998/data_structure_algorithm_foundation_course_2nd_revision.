#include<bits/stdc++.h>

using namespace std;

int main(){

int a,b;
cout<<"Enter two nos";
cin>>a>>b;

while(a%b!=0){

int c=a%b;
a=b;
b=c;
}

cout<<b;

    return 0;
}
