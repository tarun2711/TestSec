
public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int r,temp,sum=0;
       int n=457;
       temp=n;
       
       while(n>0) {
    	   r=n%10;
    	   sum=(sum*10)+r;
    	   n=n/10;
       }
       if(temp==sum) {
    	   System.out.println("palindrome");
       }else {
    	   System.out.println("not palindrome");
       }
       
	}

}
