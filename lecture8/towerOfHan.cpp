#include<iostream>
using namespace std;

//recursion
//expectation : my program does itself the program ,to move 
//n disks from sr to dest

// faith = n disks from s to dn using hl , by 
// faith = will take n-1 disks from sr to hl using dn as helper
//then ......
// faith
void toh(int n, int sr , int dn, int hl){

if (n==0){
    return;
}

toh(n-1, sr , hl , dn);

cout<< n <<"->"<<"["<< sr<<"->"<<dn<<"]"<<endl;

toh(n-1, hl, dn , sr);

}


int main(){

toh(3, 1 , 2, 3);

}