package edu.iowa;

import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.glassfish.jersey.internal.util.collection.MultivaluedStringMap;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONTokener;
import org.codehaus.jettison.json.JSONException;


@Path("/")
@Produces("text/html")
public class Handler {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Catenate")
    @Consumes(MediaType.APPLICATION_JSON)
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
                
                /**
                 * This is the server
                 * main.java - to start the server
                 * handler.java -> 
                 * > by default, the method String Catenate();
                 * > is called by (not directly) main.java from client 
                 * > it then send to server's main.java
                 * > main.java then call the method
                 * 
                 * to-do:
                 * 1. comment Catenate() out for reference (or delete it)
                 * 2. implement methods here (handler.java)
                 * 3. connect this handler with our search engine
                 * 4. might connect this with search engine method/parser
                 * 5. connect the main.java with client's main.java scanner
                 * 
                 */
    }
}
