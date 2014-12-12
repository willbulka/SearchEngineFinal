package org.uiowa.cs2820.engine;

public interface Database {
	  public abstract String[] fetch(Field f);  // fetch a Node by Field 
	  public abstract void store(Field f, String id); // store a Field/id
	  public abstract void remove(String id); // delete document (by identifier) 
	  public abstract ArrayList<Node> fetchAll();
	  }
