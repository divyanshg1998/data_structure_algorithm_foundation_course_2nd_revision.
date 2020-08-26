#include<iostream>

using namespace std;

int main(){

    int e1s=3;
    int e1e=9;

    int e2s=6;
    int e2e=8;

    if( e2s>e1e || e1s >e2e )
    {
        cout<<"no overlapping";
    } 

    else if((e1s<e2s && e1e<e2e )|| (e1s>e2s && e1e<e2e)){
        
        cout<<"partial overlaping";
    }

    else
     {
        cout<<"full overlaping";
    }

    cout<<endl;

    return 0;

}


