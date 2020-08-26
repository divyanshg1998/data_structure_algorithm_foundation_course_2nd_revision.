import java.util.*;
public class dicePossible{
    static int ctr=0;
    static void dice(int sum, int msum, String str){
        if(sum==msum){
            System.out.println(str);
            ctr++;
            return;
            }

            for(int i=1; i<=6; i++){

                if(i+msum<=sum){
                    dice(sum,msum+i, str+i+" ");
                }
            }
    }
public static void main(String[] args){

    //ques
    // we can roll the dice infinte times
    // print all those options 
    // which can give us the sum as 7
    
    dice(7,0,"");
    System.out.println("ctr:"+ctr);
}


}