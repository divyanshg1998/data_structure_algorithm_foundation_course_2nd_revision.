#include<bits/stdc++.h>
using namespace std;

void wordBreak(unordered_set<string>& dict, string qu, string asf){
if (qu.length()==0){
    cout<<asf<<endl;
    return;
}

for(int i=1; i<=qu.size(); i++){
// loop start and end
    string prefix= qu.substr(0,i);
    
    if(dict.count(prefix)){
        string ros= qu.substr(i,qu.length()-prefix.length());
        
        wordBreak(dict, ros, asf+prefix+"-");
    }
}
}

int main(){


// unordered_set<string> dict1 {"a","b"}; //bracki-like-sam-sung-mango-et{}
// dict2.insert("add");
// dict2.insert("bxz");

unordered_set<string> dict {"i", "like", "sam","sung","samsung","man","go","mango"}; 

string str= "ilikesamsungmango";

wordBreak(dict, str,"");

    return 0;
}