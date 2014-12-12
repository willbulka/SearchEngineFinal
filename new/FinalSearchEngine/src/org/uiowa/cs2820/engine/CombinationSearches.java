package src.org.uiowa.cs2820.engine;

import java.util.ArrayList;
//import java.util.regex.*;

/*

LOTS TODO! Right now, the best approach is to take a look at:
    https://github.com/willbulka/SearchEngineFinal/blob/master/new/FinalSearchEngine/src/org/uiowa/cs2820/engine/AddedSearches.java

From here, we can see 
  1.  What the best way to search through the Databases are.
  2.  How modified searches look and work.
  
  Add simple documentation and pseudocode for what should be implemented.
  Right now, if we take a look at the course website, we see:
    "
      Allow for combinations of searches. As an example, suppose someone 
      wanted to know what are all the identifiers (like filenames or 
      document IDs) that have both Field equal ("Year","2005") and Field 
      less-than ("Feature","swipe") in the database. Combinations could 
      use conjunction (and) as well as disjunction (or) operators to 
      build up searches.
    "

*/
public class CombinationSearches{

  public static ArrayList<String> andSearch(Field f, ArrayList<Field> D){
  	// TODO: Add stuff to TODO
  }
  
  public static ArrayList<String> orSearch(Field f, ArrayList<Field> D){
  	// TODO: Add stuff to TODO
  }

  public static ArrayList<String> generalSearch(Field f, ArrayList<Field> D){
		ArrayList<String> s = new ArrayList<String>();

		for(Field n : D){
			
			//Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = n.getFieldName();
			
			if(name0.compareTo(name1) == 0){
				s.add(n.toString());
			}
		}			
		return s;
}//End class
