#include<bits/stdc++.h>
using namespace std;

int fun(vector<int>& ques, int vidx, int sum1, string& s1, int sum2, string& s2 ){

if( vidx == ques.size()){

if(sum1==sum2){
cout<<s1<<"   "<<s2<<endl;
return 1;
}

return 0;
}

s1+=to_string(ques[vidx])+" ";
int n1=fun(ques, vidx+1, sum1+ques[vidx], s1, sum2, s2 );
s1.erase(s1.length() - 3, 3);


s2+=to_string(ques[vidx])+" ";
int n2=fun(ques, vidx+1, sum1, s1, sum2+ques[vidx], s2 );
s2.erase(s2.length() - 3, 3);

int n4=fun(ques, vidx+1, sum1, s1, sum2, s2 );

int n3=n1 + n2+ n4;
return n3;

}

int main(){

vector<int> ques{ 10, 20, 30, 40, 50 , 60, 70 }; 
string s1,s2;

vector<int> v1;
s1+=to_string(ques[0])+" ";

vector<int> v2;
cout<<fun(ques, 1, 10, s1, 0, s2) << endl;

    return 0;
}