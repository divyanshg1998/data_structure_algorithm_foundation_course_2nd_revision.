import java.util.*;

public class MinCostPath 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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
		
		mazePath(costs);		
		}
	
	public static void mazePath(int[][] costs){

		
		int[][] strg= new int[costs.length][costs[0].length];
		
		for(int i=strg.length-1; i>=0; i--){
			
			for(int j=strg[0].length-1 ; j>=0 ;j--){
				//4 parts a 2d
				
				if(i==costs.length-1 && j==costs[0].length-1){
					strg[i][j]=costs[i][j];				
				}
				
				else if(i==costs.length-1)
				{
					strg[i][j]=costs[i][j]+strg[i][j+1];
				}
				
				else if(j==costs[0].length-1){
					
					strg[i][j]=costs[i][j]+strg[i+1][j];
				}
				
				else{
					int mymin= Math.min(strg[i][j+1], strg[i+1][j]);
					
					if(mymin==strg[i][j+1]){
						strg[i][j]=costs[i][j]+strg[i][j+1];
					}
					
					else {
						strg[i][j]=costs[i][j]+strg[i+1][j];
						}					
				}
		
			}
		
	
}
	
		
		for(int i=0; i<strg.length; i++){
			for (int j=0; j<strg[0].length; j++){
				System.out.print(strg[i][j]+" ");
								
			}
			System.out.println();
		}

		printAllPathsOfMinSameValue(strg,strg.length-1,strg[0].length-1,"");
		//there is quite similarity between climbstairs2( to find the minimum
		//path ) and find min amount of maizepath

	}	
	
	public static void printAllPathsOfMinSameValue
	(int[][] strg,int i,int j,String str){
	//for 2d 
		//write high level first
		//break 4 cases
if(i==0 && j==0)
{
	str+=strg[i][j];
	System.out.println(str);
	return;
}
	
else if(i==0)
{
	printAllPathsOfMinSameValue(strg, i, j-1, str+strg[i][j]+" ");
}
	
else if(j==0)
{	
	printAllPathsOfMinSameValue(strg, i-1, j, str+strg[i][j]+" ");
}
	
else
{
		//for more than one path
		if(strg[i-1][j]<strg[i][j-1])
	{
		printAllPathsOfMinSameValue(strg, i-1, j, str+strg[i][j]+" ");
	}

		else if(strg[i-1][j]==strg[i][j-1])
		{
			printAllPathsOfMinSameValue(strg, i-1, j, str+strg[i][j]+" ");
			printAllPathsOfMinSameValue(strg, i, j-1, str+strg[i][j]+" ");
		}

		else
		printAllPathsOfMinSameValue(strg, i, j-1, str+strg[i][j]+" ");
		}

}
	//two same paths come up
}