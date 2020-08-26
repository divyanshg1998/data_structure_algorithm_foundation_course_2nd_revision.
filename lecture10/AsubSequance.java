import java.util.*;
public class AsubSequance{
    
    public static void main(String[] args){

        ArrayList<String> list= getss("abc");
        System.out.println(list);


        // ArrayList<String> lists= getss("abcd");
        // System.out.println(lists);

        ArrayList<String> list3= getss2("abc");
        System.out.println(list3);

   }

   public static ArrayList<String> getss(String str){

    if(str.length()==0){
        // not str==""
        //because null given to base case by substring func
        ArrayList<String> s= new ArrayList<String>();
        s.add("*");
        //we always add anything in the list so that for loop works when it is returned
        return s;
    }

    char ch = str.charAt(0);//a
    String ros= str.substring(1);//bc
    
    ArrayList<String> RecResult= getss(ros);//bc
    ArrayList<String> myResult= new ArrayList<>();//abc
    //take care of the order in which output coming

for(int i=0; i<RecResult.size(); i++){

    myResult.add("-"+RecResult.get(i));
}

for(int i=0; i<RecResult.size(); i++){

    myResult.add(ch+RecResult.get(i));
}

return myResult;
}


public static ArrayList<String> getss2(String str){

    if(str.length()==0){
        // not str==""
        //because null given to base case by substring func
        ArrayList<String> s= new ArrayList<String>();
        s.add("*");
        //we always add anything in the list so that for loop works when it is returned
        return s;
    }

    char ch = str.charAt(str.length()-1);//c
 //notice above
    String ros= str.substring(0,str.length()-1);//ab
    
    ArrayList<String> RecResult= getss2(ros);//ab
    //take care you change the name of func call when copy the func
    //like 2 here
    ArrayList<String> myResult= new ArrayList<>();//abc
    //take care of the order in which output coming

for(int i=0; i<RecResult.size(); i++){

    myResult.add(RecResult.get(i)+"-");
    myResult.add(RecResult.get(i)+ch);
    
}
return myResult;
}
}