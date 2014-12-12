/*
Tim Miller (Problem Five's Interface) 
*/

package org.uiowa.cs2820.engine;

import java.util.Iterator;

public interface IteratorInterface<E> {
	
	public Object next();
	
	public Iterator<E> showAll();
		
	public boolean hasNext();
}
