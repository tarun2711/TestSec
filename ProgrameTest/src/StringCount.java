
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="tarun rathore";
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);

	}

}
