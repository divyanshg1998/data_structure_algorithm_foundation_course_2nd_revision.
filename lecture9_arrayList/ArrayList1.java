import java.util.*;

public class ArrayList1 {
    
    public static void rotate(ArrayList<Integer> lists, int k)
    {
        for(int i=0; i<k; i++){
        int var = lists.remove(lists.size()-1);
        lists.add(i,var);
        }
    
    }
    
    public static void main(String[] args){

        ArrayList<Integer> lists=new ArrayList<>();
        lists.add(10);
        lists.add(20);
        lists.add(30);
        lists.add(40);
        lists.add(50);
        lists.add(60);
        lists.add(70);
        System.out.println(lists);
        rotate(lists,3);
        System.out.println(lists);
    }
}