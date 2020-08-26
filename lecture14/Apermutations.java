import java.util.*;

public class Apermutations {

    static void  printPerm(boolean[] boxes, int bi, int ti, String psf)
    { 
        if(bi>ti){
            System.out.println(psf);
            return;
            }

        for(int i=0; i<boxes.length ; i++ ){
    
            if(boxes[i]!=true){

            boxes[i]=true;
            printPerm(boxes, bi+1, ti, psf+bi+"["+i+"] ");
            boxes[i]=false;
        }    
    
     }

    }

    public static void main(String[] args) {

        // to find the possible permutations if to put 2 object in 4 boxes 
        boolean[] boxes = new boolean[4];

        printPerm(boxes, 1, 2, "");
        
    }

}