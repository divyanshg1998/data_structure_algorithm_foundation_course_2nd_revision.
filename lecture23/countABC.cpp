#include<bits/stdc++.h>

using namespace std;

void countAbc(string str){

int a=0;
int ab=0;
int abc=0;
for(int i=0; i < str.size(); i++ ){
    
    //c++ & java
    //for str we have size()      and      for str we have length with()
    // for arr we have length without brackets     for arr length without ()
    // notice arr and str in java
    // for al  size()      for al length()

    if(str[i] == 'a'){
        a=1+2*a;
    }
    else if(str[i] == 'b'){
        ab=a+2*ab;
    }
    else if(str[i] == 'c'){
        abc= ab+2*abc;
    }
}

cout<<str<<":"<<endl<<"a:"<<a<<endl<<"ab:"<<ab<<endl<<"abc:"<<abc<<endl;

}
int main(int argc, char** argv){


string str= "abcabc";

countAbc(str);
countAbc("aabbcc");

    return 0;
}