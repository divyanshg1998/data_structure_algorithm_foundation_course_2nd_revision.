#include<bits/stdc++.h>
using namespace std;

void fun2(int cb, int n, int bfsf, int r, string asf){
// cb=curr box
// bfsf=box foun so far 

if(bfsf==r){
    cout<<asf<<endl;
    return;
}

if(cb==n){
    return;
}

//true
fun2(cb+1 , n , bfsf+1,r,asf+to_string(cb)+" ");

//false
fun2(cb+1,n,bfsf,r, asf );

}
int main()
{

    // case 2
    // levels and options swapped here
    // levels= boxes 
    // options = objects(1,2)

// fun2(0, 4, 0, 3, "");

fun2(0, 4, 0, 2, "");

    return 0;
}