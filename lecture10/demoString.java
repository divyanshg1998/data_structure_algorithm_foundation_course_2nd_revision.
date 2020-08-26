import java.util.*;
public class demoString{

    public static void main(String[] args){

        // find  all the  possible subsequance substringss of the given string
        ArrayList<String> list= getss("abc");
        System.out.println(list);


        ArrayList<String> lists= getss("abcd");
        System.out.println(lists);
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
}
