#include<bits/stdc++.h>
using namespace std;
int main()
{
    //good ques
    //print the buildings height vertically

    vector<int> arr={3,5};
    int floorlength [] = { 4 , 7 , 2, 8, 5};

    int max=INT_MIN;
    
    for(int i=0; i< 5; i++){
        if(floorlength[i]>max){
           max=floorlength[i]; 
        }
    }

    for(int floor=max; floor>=1; floor-- ){
        
        for(int i=0 ; i< 5; i++){
          if(floorlength[i]>=floor){
            cout<<"*";
          }

        else{
            cout<< " ";
        }
    }
    cout<<endl;
    }

    return 0;

}