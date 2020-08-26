#include<bits/stdc++.h>

using namespace std;

void swap(int arr[], int left , int right){
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
}

void reverse(int arr[],int n){

int left=0, right=n-1;

    while(left<right){
    
    swap(arr,left,right);
    
        left++;
        right--;
    }
}



int main(int argc,char**argv)
{

    int arr[]={10,20,30,40,50};
    reverse(arr,5);
    
    cout<<"swapped"<<endl;
    for(int i=0; i<sizeof(arr)/sizeof(int); i++){
        cout<<arr[i]<<" ";
    }
    
    cout<<endl;
    return 0;
}

