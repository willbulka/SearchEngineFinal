/*
 Tim Miller (Problem Five)
*/
package org.uiowa.cs2820.engine;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Iterator; 
import java.util.ArrayList;
=======
import java.util.Iterator; //Why not import cCollection instead? Will bring up `issue` with this!
>>>>>>> FETCH_HEAD
=======
import java.util.Iterator; //Why not import cCollection instead? Will bring up `issue` with this!
>>>>>>> FETCH_HEAD
=======
import java.util.Iterator; //Why not import cCollection instead? Will bring up `issue` with this!
>>>>>>> FETCH_HEAD

public class IteratorClass implements IteratorInterface {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		ArrayList a = new ArrayList();
		Iterator I = a.iterator();
	
	public boolean hasNext(){
		if (I.hasNext()) {
		   return true;
		}
		else{
		   return false;
		}
	}
					
	public Object next(){
		AddedSearches x = new AddedSearches();
		a = x.s;
		if(I.hasNext()){
			return I.next();
		}
		else{
			return null;
	}
}

	public void showAll(){
				
		/*TODO:
		    Current Issues:
		      1. Does showAll() display, or does it simply return?
		    showAll() will do the following:
		      1. Display/return all of the potential search successes.
		*/   
	}

	public void hasPrevious(){
=======
=======
>>>>>>> FETCH_HEAD
=======
>>>>>>> FETCH_HEAD
	public static void hasNext(//Parans){
		/*TODO:
		    If this hasNext, we need to decide whether that means that:
		        1. Going back to the top of the file returns false
		        2. Going back to the value that is currently being held (i.e. 1st result, sent back to first)

		    Should use: 
		         for (type item: iterableCollection) {
                          // do something to item
                         }
		 */  
	}
	
	public static void next(){
		/*TODO:
		    next() will do the following:
		      1. Will return the next element in the list
		      2. Will call hasNext() first to see if there is anything even to return!
		      3. This is a simple call to `Collection.next()`!
		    
		*/
		
	}
	
	public static void showAll(){
		/*TODO:
		    Current Issues:
		      1. Does showAll() display, or does it simply return?
		    showAll() will do the following:
		      1. Display/return all of the potential search successes.
		*/   
	}
	
	public static void remove(){
		/*TODO:
		    1. remove() is a built in function from Collection
		    remove() does the following:
		       1. removes SOMETHING from SOMETHING ELSE.
		    remove() could `remove` an Object to the search
		      if remove() does do the above, then:
		        a new search has to be made; everything else cleaned and refreshed
		*/
	}
	
	public static void add(){
		/*TODO:
		    1. add() is a built in function from Collection
		    add() does the following:
		       1. adds SOMETHING to SOMETHING ELSE.
		    add() could `add` an Object to the search
		      if add() does do the above, then:
		        a new search has to be made; everything else cleaned and refreshed
		        
		    ISSUE: Lets have an update_dude!
		*/
	}
	
	public static void hasPrevious(){
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> FETCH_HEAD
=======
>>>>>>> FETCH_HEAD
=======
>>>>>>> FETCH_HEAD
		/*NOT SURE IF NEEDED
		    returns boolean of any previous results
		    However, if we are somwhere with next and data_struct, then obvi there was a previuos.
		    
		    Not necessary?
		*/
	}
	
	
}
