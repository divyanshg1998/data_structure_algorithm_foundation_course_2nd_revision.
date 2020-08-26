import java.util.*;

public class events{

    public static void main(String args[]){

    int e1s=3;
    int e1e=9;

    int e2s=6;
    int e2e=8;

    if( e2s>e1e || e1s >e2e )
    {
        System.out.println("no overlapping");
    } 

    else if((e1s<e2s && e1e<e2e )|| (e1s>e2s && e1e<e2e)){
        System.out.println("partial overlaping");
    }

    else
     {
        System.out.println("full overlaping");
    }
    }

}