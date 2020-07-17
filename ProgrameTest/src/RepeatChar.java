
public class RepeatChar {
	
String str="vinay";
int count =0;

void M1()
{ 
	 for(int I=0;I <str.length()-1;I++){
		 if(str.charAt(I)=='v'){
			 count++;
			                   }
		System.out.println(count);
	                                   }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepeatChar r=new RepeatChar();
		r.M1();
		
//		String str="tarun";
//		int count=0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='a') {
//				count++;
//			}
//			System.out.println(count);
//		}

	}

}
