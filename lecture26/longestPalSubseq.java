import java.util.*;

public class longestPalSubseq{
    public static void main(String[] args)
    {
        String str="abckycbc";
        System.out.println(fun(str));

        //longest and count of the longest palindromic substring
        fun2("abccbc");
        //extra
        //we can do lpsstring by keeping length as varb  
        // fun3();

        




    }

    public static int fun (String str){

     int strg[][]= new int[str.length()][str.length()];
     
     for(int gap=0; gap < str.length(); gap++){
        for(int i=0; i< str.length()- gap; i++){
            int j=i+gap;

            if(gap == 0){
                strg[i][j] = 1;
            }
            else if(gap==1){
                strg[i][j] = str.charAt(i)==str.charAt(j) ? 3 : 2 ;  
            }
            else{
                if(str.charAt(i) == str.charAt(j))
                {
                    strg[i][j] = strg[i][j-1] + strg[i+1][j] + 1;
                }
                else{
                    strg[i][j] = strg[i][j-1] + strg[i+1][j] - strg[i+1][j-1];
                }
            }
        }
     }

     for(int i=0; i<strg.length; i++){
         for(int j=0; j< strg[0].length; j++){
             System.out.print(strg[i][j]+"\t");
         }
         System.out.println();
        }

        return strg[0][strg.length-1];
    }

    public static void fun2(String str){

        // can do by two approaches 
        // bcz to just check if c1==c2
        // if the inside middle string is just a palindrome or not

        boolean[][] strg= new boolean[str.length()][str.length()];

        int ctr=0, longest=0;
        for(int gap=0; gap<str.length(); ++gap){
            for(int i=0; i<str.length() - gap; i++){
                int j=i+gap;

                if(gap==0){
                    strg[i][j]= true;
                }
                else if(gap==1){
                        strg[i][j] = str.charAt(i) == str.charAt(j)
                            ;
                    }
                else{
                        strg[i][j] = str.charAt(i) == str.charAt(j) && strg[i+1][j-1]; 
                    }

                    if(strg[i][j] == true){
                        ctr++;
                        longest = gap + 1;
                    }
                }                       
            }
            
            for(int i=0; i<strg.length; i++){
                for(int j=0; j< strg[0].length; j++){
                    System.out.print(strg[i][j]+"\t");
                }
                System.out.println();
               }
       
            System.out.println("longest substring length:" + longest);

            System.out.println("count of palindromic length:"+ ctr);
     }
}




 