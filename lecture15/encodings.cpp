#include <bits/stdc++.h>
using namespace std;

void encodings(string qu, string ans){

if(qu.length()==0){
    cout<<ans<<endl;
    return;
}

else if(qu.length()==1)
{
    int ch1=qu[0];   

    if(ch1!='0'){

    int ch=qu[0]-48;
    string ros=qu.substr(1,qu.length()-1);
    char a= (char)(ch + 'a'-1);

    encodings(ros, ans+a);
    }
}

else if (qu.length()>=2){

    int ch1=qu[0];   
  
    if(ch1!='0'){

// char 1 call 
    int ch2=qu[0]-48;
    string ros1=qu.substr(1,qu.length()-1);
    char a= (char)(ch2 + 'a'-1);
  
    encodings(ros1, ans+a);

//  char 2 call
    int ch4=qu[0]-48;
    int ch5=qu[1]-48;
    string ros2=qu.substr(2,qu.length()-2);
    
    char num1= ch4*10 +ch5; 
    if(num1>=10 && num1<=26){
    char here= num1+'a'-1;

    encodings(ros2, ans + here);
    }
    } 
}
   
    // // str to int
    
    // stringstream sin(str);
    //   int i=1;
    //   sin>>i;
    // //   cout<<i<<endl;

   
}


int main(){


string str;
cin>>str;

encodings(str,"");

    // encodings("1123","");
    // cout<<"<-------->"<<endl;
    // encodings("1023","");
    // cout<<"<-------->"<<endl;
    // encodings("1321","");

    
    // stringstream sin("23 45"); 
    //   int i=1;
    //   int j=2;

    //   sin>>i;
    //   cout<<i<<endl;
    //   sin>>j;
    //   cout<<j<<endl;
          
// the above code will only work for ("23 45") and not
 
 

// char to int, itself, bcz comes in [ ] for indx
    // char ch1='b';
    // int a1 = (ch1-1);
    // cout<< a1<<endl ;


// int to char
    // int ch='b';
    // char a = (char)(ch-1);
    // cout<< a ;
    
return 0;
}
