package Testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;





public class ArrList {

	public static void main(String[] args) {

/*ArrayList<Integer> alst = new ArrayList<Integer>(Collections.nCopies(100, 19));
System.out.println(alst);
for (int n:alst){
	System.out.println(n);
}*/
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> arrlist2= new ArrayList<Integer>();

	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);
	      
	      arrlist2.add(14);
	      arrlist2.add(72);
	      arrlist2.add(390);
	      arrlist2.add(400);
	      
	      
	      
	      for (int i=0; i<arrlist.size();i++){
	    	  
	    		  
	    		  if(arrlist.get(i).equals(arrlist2.get(i))){
	    	    	  System.out.println("equal");
	    	      
	    	      }
	    	      else{
	    	    	  System.out.println("not equal");
	    	      }
	    	      
	    		  
	    	  }
	    	  
	      }
	      
	     /* if(arrlist.get(0).equals(arrlist2.get(0))){
	    	  System.out.println("equal");
	      
	      }
	      else{
	    	  System.out.println("not equal");
	      }
	      */

	      /* For Loop for iterating ArrayList */
	      /*System.out.println("For Loop");
	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
	          System.out.println(arrlist.get(counter));*/ 
	          
	      /*Iterator itr = arrlist.iterator();
	          while(itr.hasNext()){
	        	  System.out.println(itr.next());
	      
	          }*/
	     // ListIterator<Integer> lstitr = arrlist.listIterator();
	      
	     /* while(lstitr.hasNext()){
        	  System.out.println(lstitr.next());
      
          }*/
	      
	      /*while(lstitr.hasPrevious())
	      {
	    	  System.out.println(lstitr.previous());
		}*/
	      }
		
	


