#include<bits/stdc++.h>
using namespace std;

bool isValid(vector<vector<int>>& arr, int idx, int no){

    int r= idx/arr.size();
    int c= idx% arr[0].size();

    for(int i=0; i< arr.size(); i++){
        if(arr[i][c]==no){
            return false;
        }
    }

    for(int i=0; i< arr[0].size(); i++){
        if(arr[r][i]==no){
            return false;
        }
    }

    int ii=r/3*3;
    int jj=c/3*3;
    for(int i=ii; i<=ii + 2;i++)
    {
        for(int j=jj; j<=jj +2; j++){
            
            if(arr[i][j] == no){
                return false;
            }

        }
    }

    return true; 
}

int counter=0;

void soduku(vector<vector<int>>& arr, int num){

if(num==arr.size()*arr[0].size()){

counter++;
int ro=0;
cout<<"*********"<<counter<<"**********"<<endl;
for(int i=0; i<arr.size()*arr[0].size(); i++){
    
    int r= i/arr.size();
    int c= i%arr.size();

if (ro!=r){
    cout<<endl;
}
cout<<arr[r][c]<<" ";
ro=r;
}
cout<<endl<<"*********"<<counter<<"**********"<<endl;
return;
}

    int r= num/arr.size();
    int c= num%arr.size();

    if(arr[r][c]==0){
 
    for(int no=1; no<=9; no++){
        if(isValid(arr,num,no)){
            arr[r][c]=no;
            soduku(arr,num+1);
            arr[r][c]=0;
        }        
    }
  
    }
    else{
        soduku(arr,num+1);
    }
}

int main(){
    
     vector<vector<int>> arr 
    { 
            {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
    };    

    soduku(arr,0);
    
    return 0;
}