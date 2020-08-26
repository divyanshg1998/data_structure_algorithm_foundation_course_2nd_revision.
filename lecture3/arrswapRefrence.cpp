#include<bits/stdc++.h>

using namespace std;

void swap(int* arr , int left ,int right){

        int temp= arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
}

void display(int* arr, int n){
//adress is stored here
for(int i=0; i<n ;i++){
cout<<arr[i]<<" ";
}

}

void reverse(int* arr, int n){
//adress is stored here
    int left=0;
    int right= n-1;

    while(left<right){
      swap(arr,left,right);

      left++;
      right--;
    }
}

int main(int argc, char** argv){

int* arr=new int[5] {10,20,30, 40 , 50};

reverse(arr,5);
display(arr,5);

return 0;

}