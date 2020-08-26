import java.util.*;

public class matrixMulti{
    public static void main(String[] args){

        int[][] arr1={{10,0,1},{0,1,20}};
        int[][] arr2={{1,1,0,0},{0,1,1,0},{0,0,1,1}};

        int[][] arr3=mult(arr1,arr2);
    
    display(arr1);
    System.out.println();
    display(arr2);
    System.out.println();
    display(arr3);
} 

    public static void display(int[][] arr3){
    
        for(int i=0; i<arr3.length ; i++){
            for (int j=0; j< arr3[0].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        
    }
       public static int[][] mult(int[][] arr1, int [][]arr2){

        int[][] arr=new int[arr1.length][arr2[0].length];

        for(int i=0 ; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                int sum=0;
                for(int k=0; k<arr1[0].length; k++){
                    sum=sum+arr1[i][k]*arr2[k][j];
                }
                arr[i][j]=sum;                
            }
        }

        return arr;
       }
}