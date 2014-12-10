package src.org.uiowa.cs2820.engine;

import java.util.ArrayList;
//import java.util.regex.*;

public class AddedSearches {
	
	//GreaterThanSearch implemented here
	@SuppressWarnings("null")
	public ArrayList<String> greaterThanSearch(Field f, ArrayList<Node> D){
		ArrayList<String> s = null;
		for(Node n : D){
			Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = dataField.getFieldName();
			if(name0.compareTo(name1) == 0){
				String value0 = (String) f.getFieldValue();
				String value1 = (String) dataField.getFieldValue();
				if(value0.compareTo(value1) == 1){
					s.add(dataField.toString());
				}
			}
		}			
		return s;
			
	}
	
	//LessThanSearch implemented here
	@SuppressWarnings("null")
	public ArrayList<String> lessThanSearch(Field f, ArrayList<Node> D){
		ArrayList<String> s = null;
		for(Node n : D){
			Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = dataField.getFieldName();
			if(name0.compareTo(name1) == 0){
				String value0 = (String) f.getFieldValue();
				String value1 = (String) dataField.getFieldValue();
				if(value0.compareTo(value1) == -1){
					s.add(dataField.toString());
				}
			}
		}			
		return s;
		
	}
	
	@SuppressWarnings("null")
	public ArrayList<String> prefixSearch(Field f, ArrayList<Node> D){
		ArrayList<String> s = null;

		for(Node n : D){
			
			boolean check = true;
			
			Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = dataField.getFieldName();
			
			if(name0.compareTo(name1) == 0){
				
				String[] value0 = ((String) f.getFieldValue()).split("(?!^)");
				String[] value1 = ((String) dataField.getFieldValue()).split("(?!^)");
				
				for(int i = 0; i < value0.length; i++){
					
					if(value0[i].compareTo(value1[i]) != 0){
						check = false;
						break;
					}
				}
					
				if(check){
					s.add(dataField.toString());
				}
			
			}
		}			
		return s;
		
	}
	
	@SuppressWarnings("null")
	public ArrayList<String> containsSearch(Field f, ArrayList<Node> D){
		ArrayList<String> s = null;

		for(Node n : D){
			
			Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = dataField.getFieldName();
			
			if(name0.compareTo(name1) == 0){
				
				String value0 = (String) f.getFieldValue();
				String value1 = (String) dataField.getFieldValue();
				
				if(value1.contains(value0)){
					s.add(dataField.toString());
				}
			}
		}			
		return s;
		
	}

}
