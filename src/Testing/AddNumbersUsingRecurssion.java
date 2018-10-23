package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AddNumbersUsingRecurssion {

	public static void main(String[] args) {
		
		List list = Arrays.asList(1,2,3);
		ArrayList <Integer> list1 = new ArrayList<>(list);
		System.out.println(list1);
		int sum = addNumbers(list1.iterator());
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(List <Integer> list) {
        if (!list.isEmpty())
        	return list.get(0) + addNumbers(list.subList(1, list.size()));
        else
            return 0;
	}
    
    public static int addNumbers(Iterator <Integer> itr) {
        if (itr.hasNext())
        	return itr.next() + addNumbers(itr);
        else
            return 0;
	}

}
