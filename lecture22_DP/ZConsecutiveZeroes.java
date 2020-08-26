import java.util.*;

public class ZConsecutiveZeroes{

 public static void main(String[] args) {
    
      int c0=1;
      int c1=1;
      
      int n=5;
      
      for(int i=2 ; i<=n; i++){
          int nc0= c1;

          int nc1= c1+ c0;

          c0=nc0;
          c1=nc1;
      }

      System.out.println("consecutive zeroes:" + c0);
      System.out.println("consecutive ones:" + c1);
}

}