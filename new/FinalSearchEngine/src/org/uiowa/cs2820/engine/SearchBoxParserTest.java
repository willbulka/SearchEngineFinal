package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SearchBoxParserTest {

	@Test
	// testing the basic algorithm for parsing
	public void base() {
	    SearchBoxParser parser = new SearchBoxParser("Search (prefix (\"Word\", \"pre\")) and (equals (\"Temperature\", 85))");
	    Set<String> tokens = parser.parseSearchText();	    
	    assertEquals(tokens.toString(), "[Search, prefix, Word, pre, equals, Temperature, 85]");	    
	}
		
	@Test
	// testing "temp"
	public void testtemp() {
	    SearchBoxParser parser = new SearchBoxParser("Search (prefix (\"Word\", \"pre\")) and (equals (\"Temperature\", 85))");
	    Set<String> tokens = parser.parseSearchText();
	    List<String> temp = new ArrayList(tokens);
	    assertEquals(temp.toString(), "[Search, prefix, Word, pre, equals, Temperature, 85]");	    
	}
	
	@Test
	// testing whether the token count is correct, focusing on the search()
	public void testcase() {
	    SearchBoxParser parser = new SearchBoxParser("Search (prefix (\"Word\", \"pre\")) and (equals (\"Temperature\", 85))");
	    Set<String> tokens = parser.parseSearchText();
	    List<String> temp = new ArrayList(tokens);
	    int i = 1;
	    String method = temp.get(i);
	    assertEquals(method, "prefix");	    
	}

	@Test
	// testing whether the token count is correct, focusing on the search()
	public void tokensize() {
	    SearchBoxParser parser = new SearchBoxParser("Search (prefix (\"Word\", \"pre\")) and (equals (\"Temperature\", 85))");
	    Set<String> tokens = parser.parseSearchText();
	    List<String> temp = new ArrayList(tokens);
	    int counter = 0;
	    // temp.size() = 8
	    for (int i = 1; i+3 <= temp.size() ; i = i + 3) {
			  counter ++;
		  }
	    assertEquals(counter, 2); // two instructions	    
	}
	
}
