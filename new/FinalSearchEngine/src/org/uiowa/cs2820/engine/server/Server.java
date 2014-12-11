package org.uiowa.cs2820.engine.server;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "server" path)
 */
@Path("/")
public class Server {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    /**
     * Window Builder plug-in for GUI
     * or
     * Scanner for plain-text-shell-UI
     * import java.util.Scanner;
     * 
     * public SearchBox() {
     *		Scanner sc = new Scanner(System.in);
     *		while (exit == false)  { // escape if exit is true
     *  		System.out.println("Enter Search Term or Sentence");
     *			String name = sc.nextLine();
     *
     *			// show result
     *			// provide options
     *			// exit command
     * 
     * }
     * 
     * public options() {
     * }
     * 
     * 
     */
    
}
