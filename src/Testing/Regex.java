package Testing;

public class Regex {

	public static void main(String[] args) {

String str = "<h1> hello world </h2>";
String str1 = str.replace("/", "").replaceAll("[<h>*]", "");
/*//String str1 = str.replaceAll("<h1>", "");
boolean str12 = str.matches("<[h1]>(.+?)</[h2]>");
//boolean str1 = str.replace("/", "").matches("[<>]*");
*/ 

System.out.println(str1);

	}

}
