import java.util.*;

public class AMinCostPath{
    public static void main(String[] args){

        //we can move towards right or towards bottom, find the path which 
		//gives the least cost if we start from costs[0][0]?
		//or the least cost to reach to the bottom
	
		int[][] costs={
            {2,7,5,1,3,4},
            {1,4,9,2,9,0},
            {4,8,1,0,6,5},
            {3,3,3,1,5,4},
            {1,2,7,0,6,9},
            {5,7,1,3,8,2}
    };
    
    // System.out.println(Arrays.toString(costs));
    print(costs);
    System.out.println();
    mazePath(costs);	
    } 

    public static void mazePath(int[][] costs){

        int[][] strg =new int[costs.length][costs[0].length];

        for(int i= strg.length-1; i>=0; i--){
            for(int j=strg[0].length-1; j>=0; j--){

                if(i==strg.length-1 && j==strg.length-1){
                    strg[i][j]= costs[i][j];                    
                }

                else if( i == strg.length -1){
                    strg[i][j] = strg[i][j+1] + costs[i][j]; 
                } 

                else if( j == strg[0].length -1){
                    strg[i][j] = strg [i+1][j] + costs[i][j];
                }

                else{

                    int mymin= Math.min( strg[i][j+1] ,strg[i+1][j]);
                    strg[i][j] = mymin + costs[i][j]; 
                }
            }
        }

       print(strg);

       String str2= strg[0][0]+" ";
       minCostPath(strg, 0, 0, str2);
    }
    
    public static void print(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                
                System.out.print(arr[i][j]+" ");

            }System.out.println();
        }    
}

    public static void minCostPath(int[][] strg, int r ,int c, String str){

        // we cant start from bottom right
        
            if(r==strg.length-1 && c==strg[0].length-1 ){
                System.out.println(str);
            }

            else if( r==strg.length-1){

                str+=strg[r][c+1] +" ";
                minCostPath(strg, r, c+1, str);
            }
            else if(c==strg[0].length - 1){

                str+=strg[r+1][c]+" ";
                minCostPath(strg, r+1, c, str);
            }
            else{

                if(strg[r+1][c]<strg[r][c+1]){

                    str+=strg[r+1][c]+" ";
                    minCostPath(strg, r+1, c, str);
    
                }
                
                else if(strg[r][c+1] < strg[r+1][c]){
    
                    str+=strg[r][c+1]+" ";
                    minCostPath(strg, r, c+1, str);
    
                }

                else if(strg[r][c+1] == strg[r+1][c]){
                    // dont miss this case
                    // we will give two calls

                    // str+=strg[r+1][c]+" ";
                    minCostPath(strg, r+1, c, str+ strg[r+1][c]+" ");
    
                    // str+=strg[r][c+1]+" ";
                    minCostPath(strg, r, c+1, str + strg[r][c+1]+" ");
    
                }
    }
}
}

