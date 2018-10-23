package Testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class integersFromString {

	public static void main(String[] args) {

String str ="!@#$%^&*abc123xyzASDFCDS";

/*Pattern ptr = new Pattern(str, 0);
Matcher mtc = ptr.matcher(str);*/
String intChar = str.replaceAll("[a-zA-Z_0-9]", "");
//String intValue = str.replaceAll("[^0-9]", "");
String intValue = str.replaceAll("\\D", "");
String nonWordChar = str.replaceAll("\\W", "");
System.out.println("int char " + intChar);
System.out.println("int value " + intValue);
System.out.println("Non word char " + nonWordChar);


/*char ch[]=str.toCharArray();
for(Character c:ch)
{
	if(c.isDigit(c))
	{
		System.out.println(c+" digit");
	}
	else if(c.isLetter(c))
		System.out.println(c+" letter");
	else
	{
		System.out.println("Spe" +c);
	}
}*/

	}

}

/*@DataProvider(name="getData")
public Object[][] getData(){
//Object [][] data = new Object [rowCount][colCount];
Object [][] data = new Object [2][2];

data [0][0] = "FirstUid";
data [0][1] = "FirstPWD";

data[1][0] = "SecondUid";
data[1][1] = "SecondPWD";

return data;

}*/
