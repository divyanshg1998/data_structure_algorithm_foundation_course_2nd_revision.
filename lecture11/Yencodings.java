import java.util.*;
public class Yencodings{
   
	public static ArrayList<String> fun(String str){
		    
if(str.length()==0){
			ArrayList<String> al=new ArrayList<>();
			al.add("");
			return al;
}

		char ch= str.charAt(0);
		char ch2= (char)(ch+48);
		//0-48 A-65 a-97

		String ros=str.substring(1,str.length());
		
		ArrayList<String> rres=fun(ros);
		
		ArrayList<String> mres=new ArrayList<>();
		
		for(int i=0; i<rres.size(); i++) {
			
			if(rres.get(i) == "" || rres.get(i).charAt(0)>'i')
			{
                mres.add(ch2+rres.get(i));
                // System.out.println(ch2+rres.get(i));
			}

            if(rres.get(i) != "" && rres.get(i).charAt(0)<'i')
			 {
				mres.add(((char)(ch+rres.get(i).charAt(0)))+ rres.get(i).substring(1));
                mres.add(ch2+rres.get(i));
                System.out.println(((char)(ch+rres.get(i).charAt(0)))+ rres.get(i).substring(1));
                // System.out.println(mres.add(ch2+rres.get(i)));
            }
		}		
	return mres;	
    
}
	public static void main(String[] args) {

        String str= "1123";
		
		ArrayList<String> al= fun(str); 
		
		System.out.println(al);

       // convert char to int 
        // char ch='a';
        // int i=(int) (ch - 64); //we apply two brackets here, for c++ and java both
        // System.out.println(ch);
        // System.out.println(i); 

        // int i=1;
        // char ch3=(char)(i + 64); //we apply two brackets here
        // System.out.println(ch3);
        // System.out.println(i);
	}

}




