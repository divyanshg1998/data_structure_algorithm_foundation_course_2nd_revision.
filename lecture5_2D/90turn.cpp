#include<bits/stdc++.h>
using namespace std;
void swap(int* a, int* b){
    int temp=*a;
    *a=*b;
    *b=temp;
}

void display(int** arr, int r, int c){

    for(int i=0; i<r; i++)
        {
            for(int j=0 ; j<c; j++){
                cout<<arr[i][j]<<" ";
            }
            cout<<endl;
        }
}

int main(int** argc,char argv){
    int **arr = new int *[4];
    arr[0] = new int[5]{11, 12, 13, 14, 15};
    arr[1] = new int[5]{21, 22, 23, 24, 25};
    arr[2] = new int[5]{31, 32, 33, 34, 35};
    arr[3] = new int[5]{41, 42, 43, 44, 45};

display(arr,4,5);
cout<<endl;

    for(int i=0; i<4 ; i++){
        for(int j=0; j<5; j++){
            if(i>j){
                swap(&arr[i][j],&arr[j][i]);
            }
            else
            {
                break;
            }
       }
    }

    display(arr,4,5);

cout<<endl;
    for(int j=0; j<5/2; j++){
        for(int i=0 ; i<4 ; i++){
            swap(&arr[i][j],&arr[i][5-1-j]);
        }
    }

    display(arr,4,5);

}