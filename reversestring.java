package tesst;
//reverse a string
//dif b/w string and stringbuffer
//do we have reverse function in string?
public class ReverseString {

	public static void main(String[] args) 
	{
		String s ="selenium";
		int len = s.length();
		String rev ="";
		for(int i =len-1; i>=0; i--) {
			rev =rev + s.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	
	}

}
