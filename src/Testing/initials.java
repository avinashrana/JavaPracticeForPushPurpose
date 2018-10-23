package Testing;

public class initials {

	public static void main(String[] args) {

String str = "This is avinash rana";
String[] str1 = str.split(" ");

for (int i=0; i<str1.length; i++){
	String newString = str1[i];
	System.out.print(newString.charAt(0)+" ");
}}}
