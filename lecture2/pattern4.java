import java.util.*;

public class pattern4{
    public static void main(String[] args){

    int row=7;
    int space=row;
    
    for(int i=0; i<row-2 ; i++){
  
        for(int j=0; j<=i; j++){
            
            System.out.print(j+1+" ");

        }

        for(int k=0; k< space ; k++ )
        {
            System.out.print("  ");
            
        }   
        space-=2;
        
        for(int l=i; l>=0 ; l--){
        
            if(l!=row-3){  
                System.out.print(l+1+" ");     
               }
        }
    System.out.println();
        }
    
    // int row=4;
    // int space=row;
    // int val=1;

    // for(int i=0; i<row ; i++){

    //     int myval=val;
    //     for(int j=0; j<=i; j++){
    //         System.out.print(myval+" ");
    //         if(j<i ){           
    //             myval++; 
    //         }
    //        if (j==row-3){
    //             myval--;
    //         }
    //     }

    //     for(int k=0; k< space ; k++ )
    //     {
    //         System.out.print("  ");
            
    //     }   
    //     space-=2;
        
    //     for(int l=0; l<=i ; l++){
    //     if(l!=row-3){  
    //         System.out.print(myval+" ");
    //         myval--;
         
    //     }
    //     }
    // System.out.println();
    //     }


}
}

