#include<iostream>

using namespace std;

int main(){
    //pascal
    int row=7;
 
    for(int i=0; i<row; i++ ){
        int var;
        for(int j=0; j<=i; j++){
            if(j==0)
            {
                var=1;
            }
            else{
                var=var*(i-j+1)/j;
            }
        cout<<var<<" ";
        }
    cout<<endl;
    }



return 0;


}