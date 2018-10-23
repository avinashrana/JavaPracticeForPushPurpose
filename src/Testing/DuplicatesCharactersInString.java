package Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesCharactersInString {
	
	public static void main(String[] args)
	/*{
		String str = "avvvinnashhhhhh";
		int[] a=new int[26];
		
		for(int i=0;i<str.length();i++)
			a[str.toUpperCase().charAt(i)-65]++;
		
		for(int j=0;j<26;j++)
			System.out.println((char)(65+j)+"::::::::::"+a[j]);
	}*/
	{
		
		String str = "avinash is is da da da gf gf gf nc mc nc nc in in sapient avinash avinash";
		
		String[] str1 = str.split(" ");
		
		Map<String,Integer> strMap = new HashMap<String,Integer>();
		
		//char[] c = str.toCharArray();
		
		
		for (String ch:str1)
		{
			if(strMap.containsKey(ch))
			{
										
				strMap.put(ch.toString(), strMap.get(ch)+1);
			}
			else{
				strMap.put(ch.toString(), 1);
			}
			
		
		/*if(strMap.get(ch)>1)
			System.out.println(ch+"---"+strMap.get(ch));
		}*/
	
		//System.out.println(strMap.get("AvINash".toLowerCase()));
		}
		Set<String> ss= strMap.keySet();
		for(String ch:ss)
					{
			if(strMap.get(ch)>1)
		System.out.println(ch+"---"+strMap.get(ch));
		}
		
	
	}

}






