#include<bits/stdc++.h>

using namespace std;

int main(int argc ,char** argv){
    // binary search to find the left most element of the arr
    int arr[]=
    {10,10,10,20,20,20,30,30,30,40,40,50,50};
    int element;
    int place=-1;

    // sort(arr);   

    int leftside=0;
    int rightside=sizeof(arr)/sizeof(int)-1;

    cout<<rightside<<endl;
    cout<<"enter the element:";
    cin>>element;

    while(leftside<=rightside){
        
        int mid=(leftside+rightside)/2;
        
        // mistake of brackets here

        if(arr[mid]==element)
            {
                place=mid;
                rightside=mid-1;
              
            }

        else if(arr[mid]>element){
            rightside=mid-1;            
           }

        else{
            leftside=mid+1;
        }
    }

    if(place==-1){
        cout<<"elememt not found";
    }

    else
    {
        cout<<"element's leftmost place at:"<<place;
    }
    

    // for(int i=0 ; i< 5 ; i++){

    //     cout<<arr[i];
    // }

}