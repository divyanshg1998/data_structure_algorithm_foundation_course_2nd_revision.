import java.util.*;

public class pattern2 {

    public static void main(String[] args) {

        int row = 5;
        int space = row / 2;
        int val = 1;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < val; k++) {
                System.out.print("*");
            }

            if (i < row / 2) {
                space--;
                val += 2;
            }

            else {
                val -= 2;
                space++;
            }

            System.out.println();
        }
    }
}