import java.util.*;

public class crypto{

 static int makeTheNo(String str,int[] arr){

        int sum=0,pow=1;    

for(int i= str.length()-1; i>=0; i--){
sum+=(arr[str.charAt(i)-97]*pow);
pow*=10;
}

return sum;
    }


    static String findUnique(String s1, String s2, String s3){

        String res="";//always initialsise
        boolean[] arr= new boolean[26];

        Arrays.fill(arr, false);

            for(char ch1: s1.toCharArray()){

                if(arr[ch1-97]==false){
                res+=ch1;
                arr[ch1-97]=true;
                }
            }

            for(char ch1: s2.toCharArray()){

                if(arr[ch1-97]==false){
                res+=ch1;
                arr[ch1-97]=true;
                }
            }

            for(char ch1: s3.toCharArray()){

                if(arr[ch1-97]==false){
                res+=ch1;
                arr[ch1-97]=true;
                }
            }
            return res;
    }
static int count=0;
    
static void generateCases(String str, boolean[] nos , int[] arr){

        if(str.length()==0){
            
           int n1=makeTheNo(s1, arr);
           int n2=makeTheNo(s2, arr);
           int n3=makeTheNo(s3, arr);
            // System.out.println("here");
           if(n1+n2==n3){
            System.out.print(++count+".");
            for(int i=0 ; i<arr.length; i++){
                if(arr[i]!=-1){
                    System.out.print((char)(i+97)+"="+arr[i]+" ");
                }

            }
        System.out.println();
         }
           return;           
        }

       char ch=str.charAt(0);
        String ros=str.substring(1, str.length()-1);

        for(int opt=0; opt<=9; opt++){
            if(nos[opt]==false){
                arr[ch-97]=opt;
                nos[opt]=true;

                generateCases(ros, nos, arr);
                
                nos[opt]=false;
                arr[ch-97]=-1;
            }
          }


    }    

   static String s1,s2,s3;
    
    public static void main(String[] args){
        s1="send";
        s2="more";
        s3="money";
    
     String unique=findUnique(s1,s2,s3);
     
    //  System.out.println(unique);

    int[] arr=new int[26];
    Arrays.fill(arr,-1);
    boolean[] takenNumbers = new boolean[10];

    generateCases(unique, takenNumbers, arr);
  
    }


}