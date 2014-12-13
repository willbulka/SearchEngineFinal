package src.org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class CombinationSearchesTest {
	
	//test prefixSearch()
	@Test
	public void andTest(){
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
		
		answer.add("First:Last");
		answer.add("First:Letter");
		
		Field test  = new Field("First", "Last");
		Field test2 = new Field("First","Letter");
		
		ArrayList<String> s = CombinationSearches.andSearch(test, test2, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
		
	}


	//test containsSearch()
	@Test
	public void orTest(){
		//Creating a fake database until being able to work with disk space.
		ArrayList<Field> database = new ArrayList<Field>();
		ArrayList<String> answer = new ArrayList<String>();
		
		Field f0 = new Field("First", "After");
		Field f1 = new Field("First", "As");
		Field f2 = new Field("First", "Before");
		Field f3 = new Field("First", "Question");
		Field f4 = new Field("Second", "Answer");
		Field f5 = new Field("Second", "What");
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
		
		Field test = new Field("First", "Question");
		Field test2 = new Field("First", "Last");
		
		ArrayList<String> s = CombinationSearches.orSearch(test, test2, database);
		
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

		ArrayList<String> s = CombinationSearches.generalSearch(test, database);
		
		for(int i = 0; i < answer.size(); i++){
			assertEquals(s.get(i), answer.get(i));
		}
	}
}
