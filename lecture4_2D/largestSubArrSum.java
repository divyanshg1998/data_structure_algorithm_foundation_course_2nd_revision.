import java.util.*;

public class largestSubArrSum
{
    //kadanes algorithm
    //

    public static void main(String[] args){

        int[] arr={4,2,-3,-1,6,-4,-8,2,10,-10,1,4,10};

        int cs=0,ce=0;
        int csum=arr[0];
        
        int bs=0, be=0;
        int bsum=arr[0];
        
        for(int i=1; i<arr.length ;i++){

            if(csum>=0){
                csum=csum+arr[i];
                ce++;
            }

            else{
                csum=arr[i];
                cs=i;
                ce=i;
            }

            if(csum>bsum){
                bsum=csum;
                bs=cs;
                be=ce;
            }
        }

        System.out.println("largest sum is:"+ bsum );
        System.out.println("start:"+ bs );
        System.out.println("end:"+ be );
        
    for(int j=bs ; j<=be ; j++){
        System.out.print(arr[j]+" ");
    }    
    
    }
}
