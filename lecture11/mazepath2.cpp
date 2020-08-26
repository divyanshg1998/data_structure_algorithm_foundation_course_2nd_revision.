#include<bits/stdc++.h>
using namespace std;
vector<string> mp(int sr, int sc, int dr, int dc){

if(sr==dr && sc==dc){
    vector<string> v1;
    v1.push_back("");
    return v1;
}

vector<string> mrec;
for(int st=1; sr+st<=dr; st++){

vector<string> rrec1= mp(sr+st,sc, dr,dc);
for(int i=0; i<rrec1.size();i++){
      mrec.push_back("V"+to_string(st)+" "+rrec1[i]);
} 
}


for(int st=1; sc+st <= dc ; st++){
    
vector<string> rrec2= mp(sr,sc+st, dr,dc);
for(int i=0; i<rrec2.size();i++){
   
    mrec.push_back("H"+to_string(st)+" "+rrec2[i]);
} 
}


for(int st=1;sc+st <= dc  && sr+st<=dr; st++){
    
vector<string> rrec2= mp(sr+st,sc+st, dr,dc);
for(int i=0; i<rrec2.size();i++){
    mrec.push_back("D"+to_string(st)+rrec2[i]);
} 
}

return mrec;
}

int main(int argc, char** argv){

// can move in 4 dxns here
// vector<string> v=mp(0,0,2,2);
vector<string> v=mp(0,0,3,3);
for(auto itr: v){
    cout<<" "<<itr<<endl;
   
}
cout<<v.size();
return 0;
}