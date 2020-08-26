import java.util.*;

public class ArrList2{
    
public static void main(String[] args){

        // ArrayList<Integer> al= new ArrayList<>();
        // al.addAll(Arrays.asList(2,2,2,3,3,2,2,2,5,6,6,7,7,7,8,8));
        // System.out.println(al);
        // contract(al);
        // System.out.println(al);
        

        //for display of arrayList, can use this too
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(2);
        for( int ele1 : a){
            System.out.println(ele1);
        }
        
        ArrayList<Integer> al1= new ArrayList<>();
        al1.addAll(Arrays.asList(2,2,2,3,3,2,2,2,5,6,6,7,7,7,8,8));
        
        
        System.out.println(al1);
  

        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        al.add(new ArrayList<Integer>(Arrays.asList(1,2,2,1)));
        al.add(new ArrayList<Integer>(Arrays.asList(3,1,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(1,3,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(2,4,0,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(3,1,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(1,3,1,1)));
        System.out.println(al);

        
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        ll.add(new ArrayList<>(Arrays.asList(1,2,2,3)));
        ll.add(new ArrayList<>(Arrays.asList(1,2,2,3)));
        for( List<Integer> ele2 : ll){
            for( int ele3 : ele2){
                System.out.print(ele3 + " ");
            }
            System.out.println();
        }

        List<Integer> ll3 = new ArrayList<>();
        ll3.add(2);
        ll3.add(4);
        ll3.addAll(Arrays.asList(2,2,2,3,3,2,2,2,5,6,6,7,7,7,8,8));
        System.out.println(ll3);
normal working or not, is it workin
        
        // ArrayList<List<Integer>> aal1 = new ArrayList<List<Integer>>();
        // aal1.add((Arrays.asList(1,2,2,1)));
        // aal1.add((Arrays.asList(3,1,2,0)));
        // aal1.add((Arrays.asList(1,3,2,0)));
        // aal1.add((Arrays.asList(2,4,0,0)));
        // aal1.add((Arrays.asList(3,1,2,0)));
        // aal1.add((Arrays.asList(1,3,1,1)));
        

        // ArrayList<String> al2=new ArrayList<>();
        // al2.addAll(Arrays.asList("abc","acd"));
        // System.out.println(al2);
        

    }

}