import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		/*
		 * // String org,rev=""; // System.out.println("Enter the String : "); //
		 * Scanner in=new Scanner(System.in); // org=in.nextLine(); // int
		 * length=org.length(); // for(int i=length-1;i>=0;i--) { //
		 * rev=rev+org.charAt(i); // } // System.out.println(rev);
		 */
		String org = "tarun";
		String rev = "";

		int length = org.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);
		System.out.println("vinay dubey");
		System.out.println("tarun");

	}

}
