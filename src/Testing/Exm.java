package Testing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exm {

	public static void main(String[] args) {
		String s="geekforgeek";
        List<String> li = new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
            for(int j=s.length()-1;j>i;j--)
            {
                Set r= new HashSet();
                for(char a:s.substring(i,j).toCharArray())
                    r.add(a);

            if(s.substring(i,j).length()==r.size())
            {
                li.add(s.substring(i,j));
            }
            }
        }
        int max=0;
        List<String> maxStr= new ArrayList<>();
        String stri;
        for(String st:li)
        {
        	if(max<=st.length())
        		{max=st.length(); 
        		if(maxStr.size()==0)
        			maxStr.add(st);
        		else if(maxStr.get(0).length()==max)
        		{	 maxStr.add(st);}
        		else if(maxStr.get(0).length()<max)
        		{	maxStr.clear(); maxStr.add(st);}
        			
        			}
        }
        maxStr.forEach(System.out::println);
        
       char[] ch=s.toCharArray();
       int max1=0;
       String s1;
     for(int i=0;i<ch.length;i++)
     {
    	 Set<String> = s.substring(i,)
     }
	
	
	}
	}

