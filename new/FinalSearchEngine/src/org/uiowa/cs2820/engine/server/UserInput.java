package org.uiowa.cs2820.engine.server;

import java.util.Scanner;

public class UserInput {
	Scanner sc = new Scanner(System.in);
	String term;
	String userInp;
	boolean exit;
	
	public UserInput() {
		exit = false;
	}
	
	public void search(String word) {
		term = word;
		// search term
	}
	
	public void input() {
		System.out.println("Insert Search Term");
		//System.out.println("Press '/' for more information");
		userInp = sc.next();
		while (!exit) {
			if (userInp == "//") {
				// show available option
				options();
			}
		
			else { 
				search(userInp); 
				}
		}
	}
	
	public void options() {
		System.out.print(""); // print list of option
		
		// if exit
		// if show more result
		// etc
	}
	
}
