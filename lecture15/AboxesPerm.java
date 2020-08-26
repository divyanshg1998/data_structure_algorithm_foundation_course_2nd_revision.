import java.util.*;
public class AboxesPerm{

    static int ctr=0;
    static void perm(boolean[][] arr, int qu, String asf){

        if(qu>arr.length){
            System.out.println(++ctr+". "+asf);
            return;
        }

        for(int i=0; i< arr.length* arr[0].length; i++){
            int r=i/arr.length;
            int c=i%arr.length;

            if(arr[r][c]==false){
                arr[r][c]=true;
                perm(arr, qu+1, asf+r+c+"-");
                arr[r][c]=false;
        }
        }
    }

    static int ctr2=0;
    static void comb(boolean[][] arr, int qu, int li, String asf){

        if(qu>arr.length){
            System.out.println(++ctr2+". "+asf);
            return;
        }

        for(int i=li+1; i< arr.length* arr[0].length; i++){
            int r=i/arr.length;
            int c=i%arr.length;

            if(arr[r][c]==false){
                arr[r][c]=true;
                comb(arr, qu+1, i, asf+r+c+"-");
                arr[r][c]=false;
        }
        }
    }

     public static void main(String[] args) {

        // ques:
        // to find the no of ways(perm) to put 4 objects in a 4*4 board
        // perm(new boolean[4][4], 1,"");

        // ques:
        // to find the no of ways(comb) to put 4 objects in a 4*4 board
        comb(new boolean[4][4], 1, -1,"");
    
    }
}