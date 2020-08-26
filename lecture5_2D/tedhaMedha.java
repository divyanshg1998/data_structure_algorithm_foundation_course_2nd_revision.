import java.util.*;
public class tedhaMedha{

    public static void main(String[] args ){

        int arr[][]={
            {00,01,02,03},
            {10,11,12,13},
            {20,21,22,23},
            {30,31,32,33}};

        int extra=0;
        int j;
            for(int sum=0; sum<=arr.length*2-2; sum++ ){
                if(sum%2==0){
                
                	if(sum >= arr.length) {
                	extra++;	
                	}
        
                	for ( int i=sum-extra ; i>=0+extra; i--){
                		j=sum-i;//j comes inside for everytime initialisation
                        System.out.print(arr[i][j]+" ");
                    }
                System.out.println();    
                }

                else {
                	if(sum >= arr.length) {
                    	extra++;	
                    	}
                	
                	for ( int i=0+extra ;  i<=sum-extra; i++){
                		j=sum-i;
                        System.out.print(arr[i][j]+" ");
                    }
                	
                System.out.println();
                
                }

            }


    }


}
