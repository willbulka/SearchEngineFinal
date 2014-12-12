package src.org.uiowa.cs2820.engine;

import java.util.ArrayList;
//import java.util.regex.*;

/*

LOTS TODO! Right now, the best approach is to take a look at:
    https://github.com/willbulka/SearchEngineFinal/blob/master/new/FinalSearchEngine/src/org/uiowa/cs2820/engine/AddedSearches.java

From here, we can see 
  1.  What the best way to search through the Databases are.
  2.  blah blah blah
  
  Will think about 'blah blah blah' and more later! Want to add this first!

*/
public class CombinationSearches{

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
