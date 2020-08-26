import java.util.*;
public class BnQueens{

    static int ctr2=0;
    static void comb(boolean[][] arr, int qu, int li, String asf){

        if(qu>arr.length){
            System.out.println(++ctr2+". "+asf);
            return;
        }

        for(int i=li+1; i< arr.length* arr[0].length; i++){
            int r=i/arr.length;
            int c=i%arr.length;

            if(arr[r][c]==false && isValid(arr,r,c)){
                arr[r][c]=true;
                comb(arr, qu+1, i, asf+r+c+"-");
                arr[r][c]=false;
        }
        }
    }

    static boolean isValid(boolean [][] arr,int r, int c){

     
     for(int i=0; i<r; i++){

        if(arr[i][c]==true){
            return false;
        }
    }   

    for(int j=0; j<c; j++){
        if(arr[r][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j>=0; i--,j--){
        if(arr[i][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j<arr[0].length; --i,++j){
        if(arr[i][j]==true){
            return false;
        }
    }
    
    return true;
    }   
    


    static int ctr3=0;
    static void perm1(boolean[][] arr, int qu, String asf){

        if(qu>arr.length){
            System.out.println(++ctr3+". "+asf);
            return;
        }

        for(int i=0 ; i< arr.length* arr[0].length; i++){
            int r=i/arr.length;
            int c=i%arr.length;

            if(arr[r][c]==false && isValid2(arr,r,c)){
                arr[r][c]=true;
                perm1(arr, qu+1, asf+r+c+"-");
                arr[r][c]=false;
        }
        }
    }

    static boolean isValid2(boolean [][] arr,int r, int c){

     
     for(int i=0; i<arr.length; i++){

        if(arr[i][c]==true){
            return false;
        }
    }   

    for(int j=0; j<arr[0].length; j++){
        if(arr[r][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j>=0; i--,j--){
        if(arr[i][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j<arr[0].length; --i,++j){
        if(arr[i][j]==true){
            return false;
        }
    }
    
    for(int i=r, j=c ; i<arr.length && j>=0; i++,j--){
        if(arr[i][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i<arr.length && j<arr[0].length; ++i,++j){
        if(arr[i][j]==true){
            return false;
        }
    }
    return true;
    }   
    public static void main(String[] args){

        // extension of last ques
        // to place 4 queens in a box of 4*4

        // print comb as well as perm
       
        // comb(new boolean[4][4], 1, -1,"");
        perm1(new boolean[4][4], 1,"");//4! times comb

        

    }

}