#include<iostream>

using namespace std;

void pd(int n){

if(n==0)
    return;

cout<<n<<endl;
pd(n-1);
cout<<"hello"<<n<<endl;

//pre orer first of all and post order then
}

void pdi(int n){

if(n==0)
    return;

cout<<n<<endl;
pd(n-1);
cout<<n<<endl;

//pre orer first of all and post order then
}

int main(int argc, char** argv){

// pd(5);//print decreasing
pdi(5);//print ins & decreasig


}