import java.util.*;

public class goldMine{

    public static void pgmp2(int[][] global, String str, int r, int c){

        if( c == global[0].length){
            System.out.println(str);
            return; 
        }

        //compare all three for even three calls too

        int max= Integer.MIN_VALUE;
   
        for(int i = r-1 ; i <= r+1 && i < global.length; i++){
            // dont forget second condition
            if(global[i][c] > max){
                max=global[i][c];
            }
        } 
    
        for(int i = r-1 ; i <= r+1 && i < global.length; i++){
            // dont forget second condition
            if(global[i][c] == max){
                pgmp2( global, str + global[i][c]+" ", i, c+1);
            }
        }        
    }

    public static void printGoldMinePath(int[][] global, String str ,int c){

        int max= Integer.MIN_VALUE;
    for(int i=0 ; i < global.length ; i++){
        if( global[i][c] > max){
            max=global[i][c];
        }
    } 

    for(int i=0 ; i < global.length ; i++){
        if(global[i][c] == max){
            pgmp2(global, global[i][c]+" ", i, c+1);
        }
    } 
}

public static void print(int[][] arr){

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"\t ");
            }
            System.out.println();
        }
    } 
    

    
    public static void goldMine(int[][] local){

        int[][] global= new int[local.length][local[0].length];
        
        for(int j=local[0].length-1 ; j>=0 ; j--){

            for(int i=0; i < local.length ; i++){     
                if( j == local[0].length - 1){
                    global[i][j] = local[i][j];
                }
                else if(i==0){
                    global[i][j] = local[i][j] + Math.max(global[i][j+1], global[i+1][j+1]); 
                }
                else if( i == local.length-1){
                    global[i][j] = local[i][j] + Math.max(global[i][j+1], global[i-1][j+1]); 
                 }
                else{
                    global[i][j] = local[i][j] + Math.max(global[i+1][j+1],Math.max(global[i][j+1], 
                                                                        global[i-1][j+1])); 
                       }                                          
    }

}
print(global);
printGoldMinePath(global,"",0);  
}  

public static void main(String[] args){

        //we can dig from j=0 in horizontal, above and downwards
		//]
		
        int[][] local={
            {1,5,1,0,3},
            {1,4,0,2,3},
            {4,0,1,3,1},
            {2,4,0,4,2},
            {1,2,3,2,2}
        };
   
        print(local);
        System.out.println();
      
        goldMine(local);
              }    
}
