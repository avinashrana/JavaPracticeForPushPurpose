package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

	
	/*	boolean flag = false;
		char ch = '#';
		char ch1 = '0';
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 5; i++) {
				if ((i + j) % 2 == 0)
					System.out.print(ch);
				else
					System.out.print(ch1);
			}
			System.out.println();
		}*/
		
		int[] itt = new int[] {1,2,3,4,0,0,5,8,9};
		int temp=0;
		
		for (int i=0; i<itt.length; i++){
			System.out.print(itt[i]+" , ");
		}
		System.out.println();
		
		for(int j=0; j<itt.length; j++){
			if(!(itt[j]==0)){
				itt[temp]=itt[j];
				temp++;
			}
		}
		
		/*if(itt.equals(0))
			System.out.println("Is available");
		else
			System.out.println("Not available");
		System.out.println(itt.length);
		
		for(int i=0; i<itt.length;i++){
			System.out.println();
			for(int j= i+1; j<itt.length;j++){
				int temp=0;
				if(itt[i] < itt[j]){
					
					 temp = itt[i];
					 itt[i] = itt[j];
					 itt[j] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(itt));*/

	}
}
