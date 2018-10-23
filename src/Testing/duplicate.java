package Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicate {
	
	 public static void main (String[] args) {
		 String str = "geeksforgeeks";
			
			Map<Integer,String> strMap = new HashMap<Integer,String>();
			
			char[] c = str.toCharArray();
			
			
			
			for (Character ch:c)
			{
				//System.out.println(ch);
				if(strMap.containsKey(ch))
				{
											
					strMap.put(strMap.get(ch)+1, ch);
				}
				else{
					strMap.put(1, ch);
				}
				
				
			}
			System.out.println(strMap);
			
			

		 
		 
		 
	/*String str = "avinashisinsapient";
	
	Map<Character,Integer> strMap = new HashMap<Character,Integer>();
	
	char[] c = str.toCharArray();
	
	
	
	for (Character ch:c)
	{
		//System.out.println(ch);
		if(strMap.containsKey(ch))
		{
									
			strMap.put(ch, strMap.get(ch)+1);
		}
		else{
			strMap.put(ch, 1);
		}
		
		
	}
	System.out.println(strMap);
	
	
*/
	
	/*Set<Character> ss= strMap.keySet();
	for(Character ch:ss)
				{
	System.out.println(ch+"---"+strMap.get(ch));
	}*/

}}
