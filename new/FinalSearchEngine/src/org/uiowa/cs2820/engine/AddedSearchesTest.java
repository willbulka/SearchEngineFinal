package src.org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class AddedSearchesTest {
	
	//test prefixSearch()
	@Test
	public void prefixTest(){
		//Creating a fake database until being able to work with disk space.
		ArrayList<Field> database = new ArrayList<Field>();
		ArrayList<String> answer = new ArrayList<String>();
		
		Field f0 = new Field("First", "After");
		Field f1 = new Field("First", "As");
		Field f2 = new Field("First", "Before");
		Field f3 = new Field("First", "And");
		Field f4 = new Field("Second", "Question");
		Field f5 = new Field("First", "Later");
		Field f6 = new Field("First", "Last");
		Field f7 = new Field("Fourth", "Circle");
		Field f8 = new Field("First", "What");
		Field f9 = new Field("Third", "How");
		Field f10 = new Field("First", "Letter");
		
		database.add(f0);
		database.add(f1);
		database.add(f2);
		database.add(f3);
		database.add(f4);
		database.add(f5);
		database.add(f6);
		database.add(f7);
		database.add(f8);
		database.add(f9);
		database.add(f10);
		
		answer.add("First:Later");
		answer.add("First:Last");
		
		Field test = new Field("First", "La");
		
		
		ArrayList<String> s = AddedSearches.prefixSearch(test, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
		
		
	}


	//test containsSearch()
	@Test
	public void containsTest(){
		//Creating a fake database until being able to work with disk space.
		ArrayList<Field> database = new ArrayList<Field>();
		ArrayList<String> answer = new ArrayList<String>();
		
		Field f0 = new Field("First", "After");
		Field f1 = new Field("First", "As");
		Field f2 = new Field("First", "Before");
		Field f3 = new Field("First", "Question");
		Field f4 = new Field("Second", "Answer");
		Field f5 = new Field("First", "Later");
		Field f6 = new Field("First", "Last");
		Field f7 = new Field("Fourth", "Circle");
		Field f8 = new Field("First", "What");
		Field f9 = new Field("Third", "How");
		Field f10 = new Field("First", "Letter");
		
		database.add(f0);
		database.add(f1);
		database.add(f2);
		database.add(f3);
		database.add(f4);
		database.add(f5);
		database.add(f6);
		database.add(f7);
		database.add(f8);
		database.add(f9);
		database.add(f10);
		
		answer.add("First:Question");
		answer.add("First:Last");
		
		Field test = new Field("First", "st");
		
		
		ArrayList<String> s = AddedSearches.containsSearch(test, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
		
		
	}
	
	//test lessThanSearch()
	@Test
	public void lessThanTest(){
		//Creating a fake database until being able to work with disk space.
		ArrayList<Field> database = new ArrayList<Field>();
		ArrayList<String> answer = new ArrayList<String>();
		
		Field f0 = new Field("First", "After");
		Field f1 = new Field("First", "As");
		Field f2 = new Field("First", "Before");
		Field f3 = new Field("First", "Question");
		Field f4 = new Field("Second", "Answer");
		Field f5 = new Field("First", "Later");
		Field f6 = new Field("First", "Last");
		Field f7 = new Field("Fourth", "Circle");
		Field f8 = new Field("First", "What");
		Field f9 = new Field("Third", "How");
		Field f10 = new Field("First", "Letter");
		
		database.add(f0);
		database.add(f1);
		database.add(f2);
		database.add(f3);
		database.add(f4);
		database.add(f5);
		database.add(f6);
		database.add(f7);
		database.add(f8);
		database.add(f9);
		database.add(f10);
		
		answer.add("First:After");
		answer.add("First:As");
		
		Field test = new Field("First", "Before");
		
		
		ArrayList<String> s = AddedSearches.lessThanSearch(test, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
		
		
	}
	
	//test greaterThanSearch()
	@Test
	public void greaterThanTest(){
		//Creating a fake database until being able to work with disk space.
		ArrayList<Field> database = new ArrayList<Field>();
		ArrayList<String> answer = new ArrayList<String>();
		
		Field f0 = new Field("First", "After");
		Field f1 = new Field("First", "As");
		Field f2 = new Field("First", "Before");
		Field f3 = new Field("First", "Question");
		Field f4 = new Field("Second", "Answer");
		Field f5 = new Field("First", "Later");
		Field f6 = new Field("First", "Last");
		Field f7 = new Field("Fourth", "Circle");
		Field f8 = new Field("First", "What");
		Field f9 = new Field("Third", "How");
		Field f10 = new Field("First", "Letter");
		
		database.add(f0);
		database.add(f1);
		database.add(f2);
		database.add(f3);
		database.add(f4);
		database.add(f5);
		database.add(f6);
		database.add(f7);
		database.add(f8);
		database.add(f9);
		database.add(f10);
		
		answer.add("First:What");
		
		Field test = new Field("First", "Question");
		
		
		ArrayList<String> s = AddedSearches.greaterThanSearch(test, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
		
		
	}
	
	//test valueSearch
	@Test
	public void valueTest(){
		//Creating a fake database until being able to work with disk space.
		ArrayList<Field> database = new ArrayList<Field>();
		ArrayList<String> answer = new ArrayList<String>();
		
		Field f0 = new Field("First", "After");
		Field f1 = new Field("First", "As");
		Field f2 = new Field("First", "Before");
		Field f3 = new Field("First", "Question");
		Field f4 = new Field("Second", "Answer");
		Field f5 = new Field("First", "Later");
		Field f6 = new Field("First", "Last");
		Field f7 = new Field("Fourth", "Circle");
		Field f8 = new Field("First", "What");
		Field f9 = new Field("Third", "What");
		Field f10 = new Field("First", "Letter");
		
		database.add(f0);
		database.add(f1);
		database.add(f2);
		database.add(f3);
		database.add(f4);
		database.add(f5);
		database.add(f6);
		database.add(f7);
		database.add(f8);
		database.add(f9);
		database.add(f10);
		
		answer.add("First:What");
		answer.add("Third:What");
		
		Field test = new Field("*", "What");
		
		
		ArrayList<String> s = AddedSearches.valueSearch(test, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
		
		
	}
	
	//test valueSearch
	@Test
	public void generalTest(){
		//Creating a fake database until being able to work with disk space.
		ArrayList<Field> database = new ArrayList<Field>();
		ArrayList<String> answer = new ArrayList<String>();
		
		Field f0 = new Field("First", "After");
		Field f1 = new Field("First", "As");
		Field f2 = new Field("First", "Before");
		Field f3 = new Field("First", "Question");
		Field f4 = new Field("Second", "Answer");
		Field f5 = new Field("First", "Later");
		Field f6 = new Field("First", "Last");
		Field f7 = new Field("Fourth", "Circle");
		Field f8 = new Field("First", "What");
		Field f9 = new Field("Third", "What");
		Field f10 = new Field("First", "Letter");
		
		database.add(f0);
		database.add(f1);
		database.add(f2);
		database.add(f3);
		database.add(f4);
		database.add(f5);
		database.add(f6);
		database.add(f7);
		database.add(f8);
		database.add(f9);
		database.add(f10);
		
		answer.add("First:After");
		answer.add("First:As");
		answer.add("First:Before");
		answer.add("First:Question");
		answer.add("First:Later");
		answer.add("First:Last");
		answer.add("First:What");
		answer.add("First:Letter");
		
		Field test = new Field("First", "*");
		
		
		ArrayList<String> s = AddedSearches.generalSearch(test, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
		
		
	}
	
	
	//All methods are to be included in the AddedSearches class.
	//In all roughly 7 tests are planned for code coverage. 
	//This is by no means a definite number though.

}
