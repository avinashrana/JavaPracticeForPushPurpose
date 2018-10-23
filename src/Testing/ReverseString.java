package Testing;

public class ReverseString {
	
	public static void main(String[] args){
		
		String str = "avinash";
		
	    char[] chr = str.toCharArray();
		//char ch = str.charAt();
	
	    for(int i=str.length()-1; i>=0; i--)
	    {
	    	System.out.print(chr[i]);
	    	
	    }
		
	}

}
