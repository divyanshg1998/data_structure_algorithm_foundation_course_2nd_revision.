#include<bits/stdc++.h>
using namespace std;

bool isValid(int r, int c, vector<vector<int>>& v){

if(r<0 || r>=v.size() || c <0 || c >= v[0].size() || v[r][c] == 1 || v[r][c]==2){
    return false;
}
     return true;
}

int ctr=0;
void floodfill(vector<vector<int>>& v, int r, int c, string& str){

if(r==v.size()-1 && c== v[0].size()-1){
ctr++;
cout<<str<<endl;
return;
}

v[r][c]=2;

if(isValid(r-1, c, v) ){
    str+="t " ;
    floodfill(v, r-1, c,str);
    str.erase(str.length()-2, 2);
}

if( isValid(r-1,c-1,v) ){
    str+="tl ";
    floodfill(v, r-1, c-1,str);
    str.erase(str.length()-3, 3);
}

if( isValid(r,c-1,v) ){
    str+="l ";
    floodfill(v, r, c-1,str);
    str.erase(str.length()-2, 2);
}

if( isValid(r+1,c-1,v) ){
    str+="dl ";
    floodfill(v, r+1, c-1,str);
    str.erase(str.length()-3, 3);
}

if( isValid(r+1, c, v)){
    str+="d ";
    floodfill(v, r+1, c,str);
    str.erase(str.length()-2, 2);
}

if(  isValid(r+1, c+1, v) ){
    str+="dr ";
    floodfill(v, r+1, c+1,str);
    str.erase(str.length()-3, 3);
}

if( isValid(r, c+1, v) ){
    str+="r ";
    floodfill(v, r, c+1,str);
    str.erase(str.length()-2, 2);
}

if(  isValid(r-1, c+1, v) ){
    str+="tr ";
    floodfill(v, r-1, c+1,str);
    str.erase(str.length()-3, 3);
}

v[r][c] = 0;

}

int main(){

// syntax:
// vector<vector<bool>> v1(5, vector<bool>(5,false));
// vector<vector<int>> v2( 5, vector<int>(5, 0));

vector<vector<int>> v =
        {{0, 0, 0, 0, 0, 0, 0, 0},
         {1, 1, 1, 1, 1, 1, 1, 0},
         {0, 1, 0, 1, 0, 0, 1, 0},
         {0, 1, 0, 0, 0, 1, 1, 0},
         {0, 1, 0, 0, 0, 1, 1, 0},
         {0, 1, 0, 1, 1, 0, 0, 0}, 
         {0, 1, 1, 1, 1, 0, 1, 0},
         {0, 0, 0, 0, 1, 0, 0, 0}};
         
        string str="";
        // cout<<isValid(0,8,v)<<endl;
        floodfill(v, 0, 0, str);
        
    for(int i=0; i<v.size(); i++){
        for (int j=0; j< v[0].size(); j++){
            cout<<v[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<ctr<<endl;
    return 0;
    //does path exist , a ques of graph,
    // similiar to floodfill

}