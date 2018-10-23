package Testing;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Example {
	
	static String s="geeksforgeeksgeeksforgeeksgeeksforgeeksgeeksforgeeksgeeksforgeeks";
	static int maxSize;
	
	static LinkedHashSet<Character> set = new LinkedHashSet<>();
	static ArrayList<LinkedHashSet<Character>> set1 = new ArrayList<>();
	
	static boolean flag=true;
	
	
	public static void main(String[] args) {
		
	int j=0;
	/*for(int i=0;i<s.length();i++){
		for(;j<s.length();j++){
			if(flag){
				flag=set.add(s.charAt(j));
			}else{
				
				if(set.size()>maxSize){
					set1.clear();
					set1.add(new LinkedHashSet<>(set));
					maxSize=set.size();
				}else if(set.size()==maxSize){
					set1.add(new LinkedHashSet<>(set));
				}
				flag=true;
				j=i+1;
				set.clear();
				break;
			}
			
		}
	}*/
	
		System.out.println(set1);
		
	}

}
