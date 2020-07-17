import java.util.Scanner;

public class SwapNum {

	
	public static void main(String[] args) {
		
//       int x,y,temp;
//       System.out.println("enter the number");
//       Scanner in =new Scanner(System.in);
//       x=in.nextInt();
//       y=in.nextInt();
//       System.out.println("Before Swap number " +x +" " +y);
//       temp=x;
//       x=y;
//       y=temp;
//       System.out.println("After swap number "+ x+" " +y);
		
		
		int x,y;
		System.out.println("Enter the the number!!");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("Before Swap number " +x +" " +y);
		x=x+y;
		y=x-y;
		x=x-y;
		 System.out.println("After swap number "+ x+" " +y);
	}

}
