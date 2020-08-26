#include<bits/stdc++.h>

using namespace std;

int main(int argc ,char** argv){

    int arr[]={10,20,30,40,50};
    int element;
    int place=-1;

    // sort(arr);   

    int leftside=0;
    int rightside=4;

    cout<<"enter the element:";
    cin>>element;

    while(leftside<=rightside){
        
        int mid=leftside+rightside/2;

        if(arr[mid]==element)
            {
                place=mid;
                break;
            }

        else if(arr[mid]<element){
            leftside=mid+1;
           }

        else{
            rightside=mid-1;
        }
    }

    if(place==-1){
        cout<<"elememt not found";
    }

    else
    {
        cout<<"element at:"<<place;
    }
    

    // for(int i=0 ; i< 5 ; i++){

    //     cout<<arr[i];
    // }

}