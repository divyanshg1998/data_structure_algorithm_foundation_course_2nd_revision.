import java.util.*;

public class recursionArray
{
    //expectation = fc prints from low
    //faith=>   fc(n)=work+fc(n-1);

    public static void print( int[] arr, int indx){
        if(indx==arr.length){
            return;
        }

        System.out.print(arr[indx]+" ");
        print(arr,indx+1);//always use +1 not ++ here
        //use pre ++ always

    }

    public static void printRev( int[] arr, int indx){
        if(indx==-1){
            return;
        }

        System.out.print(arr[indx]+" ");
        printRev(arr,indx-1);//always use 1- not -- here// u were calling print in printRev

    }

    public static int max (int[] arr, int indx){

        if(indx==arr.length-1){
            return arr[indx];
        } 

        int var = max(arr, indx+1);

        if(var<arr[indx]){
              var=arr[indx];
        }
        return var;
    }

    public static boolean lsearch(int[] arr, int key, int indx){

        if(indx==arr.length){
            return false;
        }

        if(arr[indx]==key){
            return true;
        }

        //pre-region call
        boolean var=lsearch(arr, key, indx+1);

        if(var==true){
            return true;
        }
    
        else
            return false;
    }

    public static int firstIndexofKey(int[] arr, int key, int indx){

        if (indx==arr.length){
            return -1;
        }

        if(arr[indx]==key){
            return indx;
        }

        int var=firstIndexofKey(arr, key, indx+1);

        return var;
    }

    public static int lastIndexofKey(int[] arr, int key, int indx){

        //back-tracking
        if (indx==arr.length){
            return -1;
        }

        int var=lastIndexofKey(arr, key, indx+1);
        
        if(arr[indx] != -1){
            return indx;
        }
        //already got the ans
        
        else if(arr[indx] == key){
            return indx;
        //mine is the one
        }
        
        else {
            return -1;
        }
        
    }

    public static int[] allIndexOfArray(int[] arr, int key, int index, int ctr){

        if (index==arr.length)
        {
            return new int[ctr];
        }

        if(arr[index]==key){
        
            int[] var=allIndexOfArray(arr, key, index+1, ctr+1);
            var[ctr]=index;
            return var;    
        }
        
        else{
        
            int[] var=allIndexOfArray(arr, key, index+1, ctr);
            return var;
       }
    }

    public static void swap(int a, int b, int[] arr){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void revArr(int[] arr, int index){

    if(index==arr.length/2){

        return ;
    } 

    revArr(arr, index+1);
    swap(index, arr.length-1-index,arr);

}   

    public static boolean isPalind(String str){

    // if(index==str.length()/2){
    //     return false;
    // } 
    
    // revArr(arr, index+1);
    // swap(index, arr.length-1-index,arr);

}   
   
public static void main(String[] args){

// int[] arr={10,20,30,40,81,50};
// print(arr,0);
// printRev(arr,arr.length-1);
// System.out.println(max(arr,0));
// System.out.println(lsearch(arr,40,0));

int[] arr={10,20,81,30,40,81,81,50};

// System.out.println(firstIndexofKey(arr,81,0));
// System.out.println(lastIndexofKey(arr,81,0));

// int[] newarr= allIndexOfArray(arr,81,0,0);
// for(int here: newarr){
//     System.out.println(here);}

    revArr(arr, 0);
    System.out.println(Arrays.toString(arr));
    System.out.println(isPalind("abccba"));

    
}

}