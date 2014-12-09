package org.uiowa.cs2820.engine;

//package edu.iowa;

import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
// fixed import for javax.ws.rs 
// by clicking the red cross mark beside
// then clicking the fix project setup
// applied to glassfish and codehaus (seperately) too

// Alternative: 
// use PA1, then import SearchEngineV2 to it

import org.glassfish.jersey.internal.util.collection.MultivaluedStringMap;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONTokener;
import org.codehaus.jettison.json.JSONException;


@Path("/")
@Produces("text/html")
public class Server {
	@GET		    	// @PUT  // Query will be GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Catenate")	// "Catenate" - URL path (e.g. http:// ... ) 
    @Consumes(MediaType.APPLICATION_JSON)	// from Jersey
    public String Catenate(String req) {
                List<String> params = new ArrayList<String>();
                JSONTokener S = new JSONTokener(req);
                JSONArray D = new JSONArray(); // empty by default
                try { D = new JSONArray(S); }
                catch (JSONException j) {};
                for (int i=0; i<D.length(); i++) {
                        String e = "";
                        try { e = D.getString(i); }
                        catch (JSONException j) {};
                        params.add(e);
                        // System.out.println("reponse position" + i + "equals" + e);
                    }
                D = new JSONArray();
                for (int i=params.size()-1; i>=0; i--) D.put(params.get(i));
                String eBody = D.toString();
                return eBody;
                
    }
}

