package src.org.uiowa.cs2820.engine;

import java.util.ArrayList;

public class AddedSearches {
	
	//GreaterThanSearch implemented here
	public ArrayList<String> greaterThanSearch(Field f, ArrayList<Node> D){
		ArrayList<String> s = null;
		for(Node n : D){
			Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = dataField.getFieldName();
			if(name0.compareTo(name1) == 0){
				Object value0 = f.getFieldValue();
				Object value1 = dataField.getFieldValue();
				if(value0.compareTo(value1) == 1){
					s.add(dataField.toString());
				}
			}
		}			
		return s;
			
	}
	
	//LessThanSearch implemented here
	public ArrayList<String> lessThanSearch(Field f, ArrayList<Node> D){
		ArrayList<String> s = null;
		for(Node n : D){
			Field dataField = n.getKey();
			String name0 = f.getFieldName();
			String name1 = dataField.getFieldName();
			if(name0.compareTo(name1) == 0){
				Object value0 = f.getFieldValue();
				Object value1 = dataField.getFieldValue();
				if(value0.compareTo(value1) == -1){
					s.add(dataField.toString());
				}
			}
		}			
		return s;
		
	}

}
