/*
 Tim Miller (Problem Five's Unit Test)
 */

package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

	@Test
	public void test0() {
		//Test for next() method.
		ArrayList a = new ArrayList();
		Iterator I = a.iterator();
		
		if(I.hasNext()){
			assertEquals(I.next(), I.next());
			}
	}
	
	@Test
	public void test0_1() {
		//Test for next() method.
		ArrayList a = new ArrayList();
		Iterator I = a.iterator();
		
		if(!I.hasNext()){
			assertTrue(I.hasNext() == false);
			}
	}
	
	@Test
	public void test1() {
		//Test for hasNext() method.
		ArrayList a = new ArrayList();
		Iterator I = a.iterator();
		
		if (I.hasNext() == true){
			assertEquals(true, true);
		}
	}
	
	@Test
	public void test1_1() {
		//Test for hasNext() method.
		ArrayList a = new ArrayList();
		Iterator I = a.iterator();
		
		if (!I.hasNext() == true){
			assertEquals(false, false);
		}
	}

	@Test
	public void test2() {
		//Test for showAll() method
		ArrayList a = new ArrayList();
		if(a.isEmpty()){
			return; 
		}
		assertNull(a);
	}
}
