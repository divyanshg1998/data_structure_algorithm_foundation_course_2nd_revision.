#include<bits/stdc++.h>
using namespace std;

void getSubSequance(string qu, string ans){

if(qu.length()==0){
    cout<<ans<<endl;
    return;
}

char ch= qu[0];
string ros= qu.substr(1,qu.length()-1);

getSubSequance(ros, ans+ch);
getSubSequance(ros, ans+"-");

}
int ctr=0;

void printStairPath(int src,string psf){
if(src==0){
    cout<<psf<<endl;
    ctr++;return;
}

for(int j=1; j<=3; j++){
    if(src-j>=0)
    printStairPath(src-j, psf +to_string(j) );
    else
    break;

}

}

void keypadSoln(string str, string psf ){
//ques ans ans approach

if(str.length()==0){
    cout<<psf<<endl;
    return;
}

char ch = str[0];
string roq=str.substr(1,str.length()-1);

string




}

int main(){

getSubSequance("abc","");//ques and ans

printStairPath(7,"");
cout<<"paths"<<ctr;
 
 keypadSoln("835", "");

return 0;
}