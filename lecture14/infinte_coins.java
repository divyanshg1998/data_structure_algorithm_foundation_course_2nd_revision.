import java.util.*;
public class infinte_coins{

    static void perm(int[] arr, int amt , String str)
    {
        if(amt==0){
            System.out.println(str);
            return;
        }

        for(int i=0 ; i< arr.length; i++){
            if(amt-arr[i]>=0){
                perm(arr, amt-arr[i], str+arr[i]+" ");
            }
        }

    }
    

    static void comb(int[] arr,int amt, String str, int li)
    {

        if(amt==0){
            System.out.println(str);
            return;
        }
                
        for(int i=li ; i<arr.length; i++){
        //loop from li itself ,not from +1
            if(amt-arr[i]>=0){
            comb(arr, amt-arr[i], str+arr[i]+" ",i);
            }
        }

    }

    public static void main(String[] args){
    
        // we have infinite coins of val mentioned in the array
        // find all possible comb and perm of these coins to get 
        // sum as 7
    int[] arr={2,3,5,6};
    perm(arr,7,"");
    System.out.println("<----------->");
      comb(arr,7,"",0);

    }

}
