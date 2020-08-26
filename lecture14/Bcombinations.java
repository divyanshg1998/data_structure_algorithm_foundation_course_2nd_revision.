import java.util.*;
public class combinations{

static void combinations1(boolean[] boxes, 
                        int co, int to, int lib )
    {
        // co:curr objec
        // lib : last index box

        if(co>to){
            for(int i=0; i<boxes.length; i++){
                // java mai str ki length ke aage () sirf aur arraylist ka size()

                if (boxes[i]==true){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            return;
        }

for(int i=lib+1; i<boxes.length; i++){
if(boxes[i] !=true){
boxes[i]=true;
combinations1(boxes, co+1, to, i);
boxes[i]=false;
}

}
 
}

public static void main(String[] args){


    // to find the possible combinations if to put 2 object in 4 boxes 

    combinations1(new boolean[4], 1, 3, -1);

    // combinations1(new boolean[4], 1, 2, -1);
    
}

}