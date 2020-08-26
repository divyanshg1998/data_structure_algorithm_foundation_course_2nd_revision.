
import java.util.*;

public class pattern3{

public static void main(String[] args)
{

int row=7;
int space=row/2;
int val=1;
int ivalue=1;

for(int i=0; i<row; i++){

for(int j=0; j<space; j++){
System.out.print("  ");
}

int myval=ivalue;

for(int k=0; k<val; k++){
System.out.print(myval+" ");

if(k<val/2){
myval++;
}
else
{
myval--;
}
}

if(i<row/2){
space--;
val+=2;
ivalue++;
}

else{
val-=2;
space++;
ivalue--;
}

System.out.println();
}
}
}