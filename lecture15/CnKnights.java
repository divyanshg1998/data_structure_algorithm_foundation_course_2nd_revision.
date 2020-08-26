import java.util.*;
public class CnKnights{
    
    static boolean isValid(boolean [][] arr,int r, int c){
   
        // check all those condns that are not working

        if(r-2>=0 && c-1>=0 && arr[r-2][c-1]==true){
               return false;
           }   
       
        else if(r-2>=0 && c+1<arr[0].length && arr[r-2][c+1]==true){
               return false;
           }
      
        else if(r-1>=0 && c-2>=0 && arr[r-1][c-2]==true){
            return false;
        }

        else if(r-1>=0 && c+2<arr[0].length && arr[r-1][c+2]==true){
            return false;
        }
        return true;
       }
   
    static int ctr2=0;
    static void comb(boolean[][] arr, int qu, int li, String asf){

        // if(li==arr.length*arr[0].length)
        // {
            if(qu>arr.length){
            System.out.println(++ctr2+". "+asf);
            return;
            }
    // }

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

    public static void main(String[] args )
{
    comb(new boolean[4][4], 1, -1,"");
}

}