package edu.iowa;

import java.io.IOException;

/**
 * Main class.
 *
 */
public class Main {
    // Base URI the client will use
    public static final String BASE_URI = "http://localhost:8522";

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
           System.err.println("\n\n*** Error: must provide parameters to main ***\n");
           return;
           }
        new MyClient(BASE_URI, args);
        
        /**
         * This is the UI/input:
         * have to create a scanner or search box for
         * user to insert a search term or string of words
         * 
         * Executing (default + comment on to-do (---) ): 
         * 1. start main.java from restful-server,
         * 2. click on main.java for restful-client,
         * 3. click on the dropdown menu beside the "run button"
         * 4. click run configuration
         * 5. click on argument tab, insert > 2 words
         * --- ^ gonna replace this with a UI/Scanner
         * 6. click run
         * 
         * edit Handler.java for more methods
         * 
         */
    }
}

