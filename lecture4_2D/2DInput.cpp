#include<bits/stdc++.h>

using namespace std;

int** getInput(int r, int c){

int** arr=new int*[r];
for(int i=0; i<r; i++){

    arr[i]=new int[c];

    for(int j=0; j<c ; j++){
        cout<<"enter the elment "<<i<<" "<<j<<":";
        cin>>arr[i][j];
    }

}
return arr;
}

void display(int** arr , int r , int c){

for(int i=0; i<r ; i++){
    for(int j=0; j<c;j++){
        cout<<arr[i][j]<<" ";
    }
    cout<<endl;
}

}

int main(int argc, char** argv){
    int** arr= getInput(2,2);

    display(arr,2,2);

    return 0;
}