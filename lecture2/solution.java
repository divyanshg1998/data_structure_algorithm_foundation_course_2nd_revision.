
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner scn =new Scanner(System.in);
        int size= scn.nextInt();
        
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scn.nextInt();
        }
       
        Func(arr,arr.length-1,"");
    }
    public static void Func(int[] arr,int vidx, String set)
    {
        if(-1==vidx)
        {
            System.out.println(set);
            return;
        }

    
        
        Func(arr,vidx-1,set);
    
        Func(arr,vidx-1,set+arr[vidx]);
    }

}