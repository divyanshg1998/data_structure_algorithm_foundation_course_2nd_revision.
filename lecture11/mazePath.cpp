#include<bits/stdc++.h>
using namespace std;
vector<string> mp(int sr, int sc, int dr, int dc){

if(sr==dr && sc==dc){
    vector<string> v1;
    v1.push_back("");
    return v1;
}

vector<string> mrec;
if( sr+1 <= dr ){

vector<string> rrec1= mp(sr+1,sc, dr,dc);
for(int i=0; i<rrec1.size();i++){
    mrec.push_back("V"+rrec1[i]);
} 
}

if( sc+1 <= dc ){
vector<string> rrec2= mp(sr,sc+1, dr,dc);
for(int i=0; i<rrec2.size();i++){
    mrec.push_back("H"+rrec2[i]);
} 
}

return mrec;
}

int main(int argc, char** argv){

    //in a maze, we can move right and down only
    // find all the possible ways to reach from sr to dn 

vector<string> v=mp(0,0,2,2);

for(int i=0; i<v.size(); i++){
    cout<<v[i]<<endl;
}


return 0;
}