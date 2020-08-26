#include<bits/stdc++.h>
using namespace std;
// String[] str={}
// in java
string codes[]={
    "",
    "abc",
    "def",
    "ghi",
    "jklm",
    "no",
    "pqrs",
    "tu",
    "vwxy",
    "ez"    
};

vector<string> getPossible(string str){

if(str.length()==0){

vector<string> bres;
bres.push_back(".");
return bres;

}

char ch=str[0];
string ros=str.substr(1,str.length()-1);

vector<string> rres= getPossible(ros);
vector<string> mres;

string code=codes[ch-48];

for ( int i=0 ; i<code.length(); i++){

    char ch2=code[i];
        for (int j=0; j<rres.size() ;j++)
        {
            mres.push_back(ch2+rres[j]);
        }   
}

return mres;
}

int main(int argc, char** argv){

// we have the above nokia keypad , each digit/index has above char in front of it
// find all the possible results
// if uset have pushed 835

vector<string> words =getPossible("835");

for(int i=0; i< words.size(); ++i){
    cout<<words[i]<<endl;
}

cout<<"to check output can can check  by that 6 outputs are there for each char of 8"<<endl;
return 0;
}
