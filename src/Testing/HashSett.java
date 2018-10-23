package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSett {

	public static void main(String[] args) {
		
	int itt[] = {1,2,3,4,0,0,5,8,9};
	
	for(int i=0; i<itt.length;i++){
		for(int j= i+1; j<itt.length;i++){
			int temp = 0;
			if(itt[i] < itt[j]){
				/*itt[i] = temp;
				temp = itt[j];
				itt[j] = temp;*/
				
				 temp = itt[i];
				 itt[j] = itt[j];
				 itt[j] = temp;
			}
			
		}
	}
	System.out.println(Arrays.toString(itt));

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(6);

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(1);
		list2.add(2);
		list2.add(2);
		list2.add(7);

		Set<Integer> newSet = new HashSet<>(list1);
		newSet.addAll(list2);
		System.out.println("After adding both the lists, we store into new set with unique values" + newSet);

		Set<Integer> set = new HashSet<>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(1);
		set.add(2);

		System.out.println("After Adding " + set);
		

		int i = 2;
		if (set.contains(i))
			System.out.println("if contains then " + set);
		else
			System.out.println("if doesn't contain then " + set);

		set.remove(6);
		System.out.println("After removing " + set);

		set.removeIf(num -> num % 2 == 0);
		System.out.println("numbers after remainder " + set);

		set.forEach(myInt -> {
			System.out.println(myInt);
			
			
		});
		for(Integer it:set)
		{
		}
	}
}
