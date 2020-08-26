import java.util.*;

public class subseqDivbySix{
    
    public static void main(String[] args){

        String str="235168";

        fun(str,6);

    }
    public static void fun(String str, int num){

        int[][] strg= new int[str.lnegth][num];
        
        strg[0][0] = 1;

        strg[0][(str.charAt(0) - 48) % 6] = 1;
        
        for(int i=1; i< str.length(); i++){
            for(int j=0; j < 6; j++)
            {
                if(strg[i-1][j] != 0){

                    strg[i][j] += strg[i-1][j];

                    int num = j*10 + ;

                }


        }

    }

}