package org.uiowa.cs2820.engine.server;

import java.io.IOException;
import java.util.Scanner;

public class UserInput {
	Scanner sc = new Scanner(System.in);
	String term;
	String userInp;
	boolean exit = false;
	
	public UserInput() {		
	}
	
	public void search(String word) {
		term = word;
		// search term
	}
	
	public void input() {
		System.out.println("Insert Search Term");
		//System.out.println("Press '/' for more information");
		userInp = sc.next();
		userInp = sc.nextLine();
		while (sc.hasNext() & !exit) {
			userInp = sc.next();
			userInp = sc.nextLine();
			if (userInp.equals("?")) {
				// show available option
				options();
			}
			else if (userInp.equals("exit")) {
				exit = true;
			}
			else { 
				search(userInp); 
				}
		}
		sc.close();
		System.out.println("The End");
	}
	
	public void options() {
		System.out.print(""); // print list of option
		
		// if exit
		// if show more result
		// etc
	}
	
	public static void main(String[] args) throws IOException {
		UserInput x = new UserInput();
		x.input();
	}
	
}
