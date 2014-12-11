package src.org.uiowa.cs2820.engine;

import java.util.ArrayList;
//import java.util.regex.*;

public class AddedSearches {
	
	//GreaterThanSearch implemented here
	public static ArrayList<String> greaterThanSearch(Field f, ArrayList<Field> D){
		ArrayList<String> s = new ArrayList<String>();
		for(Field n : D){
			//Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = n.getFieldName();
			if(name0.compareTo(name1) == 0){
				String value0 = (String) f.getFieldValue();
				String value1 = (String) n.getFieldValue();
				if(value0.compareTo(value1) < 0){
					s.add(n.toString());
				}
			}
		}			
		return s;
			
	}
	
	//LessThanSearch implemented here
	public static ArrayList<String> lessThanSearch(Field f, ArrayList<Field> D){
		ArrayList<String> s = new ArrayList<String>();
		for(Field n : D){
			//Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = n.getFieldName();
			if(name0.compareTo(name1) == 0){
				String value0 = (String) f.getFieldValue();
				String value1 = (String) n.getFieldValue();
				if(value0.compareTo(value1) > 0){
					s.add(n.toString());
				}
			}
		}			
		return s;
		
	}
	
	public static ArrayList<String> prefixSearch(Field f, ArrayList<Field> D){
		ArrayList<String> s = new ArrayList<String>();

		for(Field n : D){
			
			boolean check = true;
			
			//Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = n.getFieldName();
			
			if(name0.compareTo(name1) == 0){
				
				String[] value0 = ((String) f.getFieldValue()).split("(?!^)");
				String[] value1 = ((String) n.getFieldValue()).split("(?!^)");
				
				for(int i = 0; i < value0.length; i++){
					
					if(value0[i].compareTo(value1[i]) != 0){
						check = false;
					}
				}
					
				if(check){
					s.add(n.toString());
				}
			
			}
		}			
		return s;
		
	}
	
	public static ArrayList<String> containsSearch(Field f, ArrayList<Field> D){
		ArrayList<String> s = new ArrayList<String>();

		for(Field n : D){
			
			//Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = n.getFieldName();
			
			if(name0.compareTo(name1) == 0){
				
				String value0 = (String) f.getFieldValue();
				String value1 = (String) n.getFieldValue();
				
				if(value1.contains(value0)){
					s.add(n.toString());
				}
			}
		}			
		return s;
		
	}
	
	public static ArrayList<String> valueSearch(Field f, ArrayList<Field> D){
		ArrayList<String> s = new ArrayList<String>();

		for(Field n : D){
			
			//Field dataField = n.getKey();
			String value0 = (String) f.getFieldValue();
			String value1 = (String) n.getFieldValue();
		
			if(value0.compareTo(value1) == 0){
				s.add(n.toString());
			}
		}			
		return s;
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
	}
	public static ArrayList<Field> convert(ArrayList<Node> N){
		ArrayList<Field> F = new ArrayList<Field>();
		for(Node n : N){
			F.add(n.getKey());
		}
		return F;
	}
}
