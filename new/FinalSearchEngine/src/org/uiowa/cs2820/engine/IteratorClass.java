/*
 Tim Miller (Iterator - Problem Five)
*/

package org.uiowa.cs2820.engine;

import java.util.Iterator; 
import java.util.ArrayList;

public class IteratorClass<E> implements IteratorInterface {

	ArrayList a = new ArrayList();
	Iterator<E> I = a.iterator();
	
	
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

	//returns the results as an iterator
	public Iterator<E> showAll(){
		if(!a.isEmpty()){
			a.iterator();
		}
		else{
			return null;
		}
		return I;
	}
}
