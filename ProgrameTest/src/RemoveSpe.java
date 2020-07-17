import java.util.Scanner;

public class RemoveSpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="giubijbnijb@#";
	   
	   for(int i=0;i<str1.length();i++) {
		   if(str1.charAt(i)>64 && str1.charAt(i)<=122) {
			   str1=str1+str1.charAt(i);
		   }
	   }
	   System.out.println(str1);
	   
	   

	}

}
