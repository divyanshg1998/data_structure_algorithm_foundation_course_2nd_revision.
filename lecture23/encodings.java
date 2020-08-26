import java.util.*;

public class encodings{

    public static void main(String[] args){

        int[] arr = { 1, 2, 1, 3, 2, 6, 1, 2, 0, 1, 4};
        // System.out.println( fun(arr));
        fun(arr);
        String str="sd";
        str.length();
     }

    public static void fun (int[] arr){

        int [] strg = new int[arr.length];
        
        //special case if arr[0]= 0 then t ewhole strg will have 0 as ans
        
        strg[0]=1;
        
        if(arr[1] != 0){
            strg[1]= 1;
        }

        int num = arr[0]* 10 + arr[1];
        System.out.println(num);

        if(num >= 10 && num <= 26){
           strg[1] =strg[1]+ 1; 
        }

        for(int i=2; i<arr.length; i++){
        
            if (arr[i] != 0){
                strg[i] += strg[i-1]; 
            }

            int num2 = arr[i-1]* 10 + arr[i];

            if ( num2 >=10 && num2 <= 26 ){
               strg[i] += strg[i-2];
            }
        
        }

for(int var: strg){
    System.out.print(var+" ");
}

} 
}