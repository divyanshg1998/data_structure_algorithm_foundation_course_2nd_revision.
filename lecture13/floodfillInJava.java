import java.util.*;

public class floodfill3{

    static void floodfill(int[][] v, int sr, int sc, String psf)
    {    
    
     if (sr == v.length -1 && sc == v[0].length-1)
        {
           System.out.println(psf);
           return;
        }
     
        v[sr][sc]=2;
        
        //0 for correct spot
        //1 for obstacle
        //2 for visited before itself
    
    
        if (sr - 1 >= 0 && v[sr - 1][sc] != 1 && v[sr-1][sc] != 2)
        {
            // cout<<"preD"<<endl;
            
            // psf+='t';
            floodfill(v, sr - 1, sc, psf+'t');
            // psf.erase(psf.length()-1,1);
            
            // cout<<"postD"<<endl;
          
        } 
        if (sc - 1 >= 0 && v[sr][sc - 1] != 1 && v[sr][sc-1] != 2)
        {
            // cout<<"preD"<<endl;
            // psf+='l';
            floodfill(v, sr, sc - 1, psf+'l');
            // psf.erase(psf.length()-1,1);
            // cout<<"postD"<<endl;
            
        } 
    
       if (sr + 1 < v.length && v[sr + 1][sc] != 1 && v[sr+1][sc] != 2)   
         
         {
            // psf+='d';
            floodfill(v, sr + 1, sc, psf+'d' );
            // psf.erase(psf.length()-1,1);
            
        }
    
        if (sc + 1 < v[0].length && v[sr][sc + 1] != 1 && v[sr][sc+1] != 2)
        {
            // psf+='r';
            floodfill(v, sr, sc + 1, psf+'r' );
            // psf.erase(psf.length()-1,1);
            
        }
    
    // v[sr][sc]=0;untakr the option
    // see
    // if we do not unmark at each place then we will get only two paths
    
    }
    
    public static void main(String[] args){

        // debug on sheet best for this code bcz 
        // as we have to look at the arr again and 
        // again
    
     int[][]  v =
        {{0, 1, 0, 0, 0, 0, 0, 1},
         {0, 1, 0, 1, 1, 1, 0, 1},
         {0, 1, 0, 1, 0, 0, 0, 1},
         {0, 0, 0, 0, 0, 1, 1, 1},
         {0, 1, 0, 1, 0, 0, 0, 0},
         {0, 1, 0, 1, 1, 1, 1, 0}, 
         {0, 1, 0, 1, 1, 1, 1, 0},
         {0, 1, 0, 0, 0, 0, 0, 0}};
           
        floodfill(v, 0, 0, "");

    for(int i=0; i<v.length; i++){
        for (int j=0; j< v[0].length; j++){
            System.out.print(v[i][j]+" ");
        }
        System.out.println();
    }
      
}
    }


