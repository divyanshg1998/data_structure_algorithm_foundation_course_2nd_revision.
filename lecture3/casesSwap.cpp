
#include<bits/stdc++.h>
using namespace std;


void swap1(int a, int b){
//call by value, value type
cout<<a<<" "<<b<<endl;

int temp=a;
a=b;
b=temp;

cout<<a<<" "<<b<<endl;
}

void swap2(int* c, int* d){
//call by ref, bcz & ,val type
cout<<*c<<" "<<*d<<endl;

int temp=*c;
*c=*d;
*d=temp;
//temp stores 5

cout<<*c<<" "<<*d<<endl;

}

void swap3(int* c, int* d){
//call by val, ref type
cout<<*c<<" "<<*d<<endl;

int temp=*c;
*c=*d;
*d=temp;
//temp stores 5

cout<<*c<<" "<<*d<<endl;

}

void swap4(int** c, int** d){
//call by ref, ref type

cout<<**c<<" "<<**d<<endl;

int* temp=*c;
*c=*d;
*d=temp;
//temp stores 5

cout<<**c<<" "<<**d<<endl;

}

int main(int argc, char** argv){

int a=5;
int b=10;

cout<<a<<" "<<b<<endl;

// swap1(a,b);

// swap2(&a,&b);

// int* c=&a;
// int* d=&b;
// swap3(c,d);

int* c=&a;
int* d=&b;

cout<<*c<<" "<<*d<<endl;
swap4(&c,&d);
cout<<*c<<" "<<*d<<endl;//swap happens


cout<<a<<" "<<b<<endl;

    return 0;

}