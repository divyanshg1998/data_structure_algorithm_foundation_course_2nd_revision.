import java.util.*;

public class Solution{

    public static void main(String[] args)
{

Scanner scn= new Scanner(System.in);
int a =scn.nextInt();
int[] arr1=new int[a];
for (int i=0; i<a; i++){

    arr1[i]=scn.nextInt();
}

int b=scn.nextInt();
int[] arr2=new int[a];
for (int i=0; i<a; i++){

    arr2[i]=scn.nextInt();
}


// int[] arr1={1,2,3,4};
// int a=4;
// int b=5;
// int[] arr2={1,2,3,4,4};
int c=Math.max(a,b);
int[] arr3=new int[c];
for (int i=0; i<c; i++){
    if(i<arr1.length && i< arr2.length)
    arr3[i]=arr1[i]+arr2[i];


    else if(i<arr1.length )
    arr3[i]=arr1[i];


    else if( i< arr2.length)
    arr3[i]=arr2[i];

}

for (int i=0; i<c; i++){

    System.out.print(arr3[i]+" ");
}









}


}