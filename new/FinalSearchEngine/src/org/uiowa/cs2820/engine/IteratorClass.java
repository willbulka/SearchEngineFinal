/*
 Tim Miller (Problem Five)
*/

package org.uiowa.cs2820.engine;

import java.util.Iterator; 
import java.util.ArrayList;

public class IteratorClass implements IteratorInterface {

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
			//TODO
	
	}
	
}
