package Testing;

import java.util.ArrayList;
import java.util.List;

public class String123 {

	public static void main(String[] args) {

String str = "This----is---------avinash--------rana";
String newStr="";
String[] str1=str.replaceAll("(-)+", " ").split(" ");

for(int i=str1.length-1;i>=0;i--){
	newStr=newStr+str1[i]+" ";
}
System.out.println(newStr.trim());
}}
