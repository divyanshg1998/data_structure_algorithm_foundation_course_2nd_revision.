#include<bits/stdc++.h>

using namespace std;

void display(int* arr, int n)
{

for(int i = 0 ; i<n; i++){
cout<<arr[i];
}

cout<<endl;

}

void swap(int* l, int* r){
int temp=*l;
*l=*r;
*r=temp;
}

void rotate(int* arr , int left , int right){

while(left<right){
swap(&arr[left],&arr[right]);
left++;
right--;
}

}

void reverse(int* arr, int n, int k){

k=k%n;

if(k<0){
    k=n+k;
}

rotate(arr,0,n-k-1);
rotate(arr,n-k,n-1);
rotate(arr,0,n-1);
}

int main(int argc, char** argv){

int* arr=new int[7]{1,2,3,4,5,6,7};

display(arr,7);

cout<<"shift 3 digits from end to start"<<endl;
reverse(arr,7,3);
display(arr,7);

cout<<"shift -3 digits from start to end "<<endl;
reverse(arr,7,-3);
display(arr,7);

cout<<"shift -51 digits from start to end "<<endl;
reverse(arr,7,-51);
display(arr,7);

}

