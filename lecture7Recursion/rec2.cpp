#include<iostream>

using namespace std;

int factorial(int n){

if( n==1){
    return 1;
}
int var=factorial(n-1);
return n*var;

}

int power(int x, int n){

if(n==0)
return 1;
int var=power(x,n-1);
return x*var;

}

int powergood(int x, int n, int [] ){

if(n==0)
return 1;

if(n%2==0){
return powergood(x,n/2)*powergood(x,n/2);
}

else {
return powergood(x,n/2)*powergood(x,n/2)*x;
}


int powerbest(int x, int n, int [] ){

if(n==0)
return 1;

if(n%2==0){
return powergood(x,n/2)*powergood(x,n/2);
}

else {
return powergood(x,n/2)*powergood(x,n/2)*x;
}
}

int main(int argc, char** argv){

    cout<<factorial(4)<<endl;
    cout<<power(2,4)<<endl;
    cout<<powergood(2,6)<<endl;

    return 0;
        
}
