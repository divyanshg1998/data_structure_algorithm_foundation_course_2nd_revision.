import java.util.*;

public class CnKnights2{

static boolean isvalid(boolean [][] arr,int r, int c){
   
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

   static int counter=0;
   // count is ambigious
    static void fun(int ksf, int tot, int li, int ti, String asf, boolean [][] tru){

        if(li==ti){
        // always till 16 bcz 15+1 always 
        // 15 should work fully for sure
        
        if(ksf == tot+1){
            System.out.println(++counter+"."+asf);
            }
        return;
        }

        fun(ksf , tot , li+1, ti, asf, tru);

        for(int i=li+1; i<ti; i++){
            int r=i/tot;
            int c=i%tot;

            if(isvalid(tru,i/tot, i%tot))
            {
                tru[r][c]=true;
                fun(ksf+1, tot, i, ti, asf+ ksf+" " + (i/tot) + (i%tot)+" ", tru);
                tru[r][c]=false;
            }
        }
    }
public static void main(String[] args){

fun(1, 3, -1, 9, "", new boolean[3][3]);

}
}