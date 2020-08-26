#include<bits/stdc++.h>
using namespace std;

vector<string> gsp(int src){

if(src==0){
    vector<string> bp;
    bp.push_back("");
    return bp;
}

vector<string> stod;

for(int i=1; i<=3; ++i){

int nbr = src-i;
if(nbr>=0)
{
    vector<string> rres=gsp(nbr);
    for(int j=0; j<rres.size(); j++){

        string s= to_string(i) + rres[j];  
        stod.push_back(s);
    }
    }
    }

return stod;

}

int main(int argc, char** argv ){

// possible paths when to climb down from 7 to 0
vector<string> ntod= gsp(7);

for(int i=0; i<ntod.size(); i++){

    cout<<ntod[i]<<endl;
}
cout<<"check sum is 7 for each"<<endl;

}