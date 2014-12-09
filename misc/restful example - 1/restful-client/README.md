This is the client half of the sample RESTful interaction between
client and server using Java and the Jersey (REST) API with JSON 
representation of the encapsulated data exchange in both directions.

The two programs here are Main.java and MyClient.java. The simple 
description of the purpose is this:

> Get the command line arguments, put them into a JSON list, send
> to the server, get back a JSON list, and print its items.

Much of the code is sensible only if one has read through the Jersey
documentation, found at [Jersey Website](https://jersey.java.net/)
(start with "Getting Started" and carry on reading as needed).

Notes:

1. The location of the server (which host/port) is a constant in Main.java;  change this if you prefer. 
2. Running the program will get an error if the server isn't up and running (should be the server in the restful-server project).
3. How to run using command-line Maven: 
> $ mvn clean compile
> $ mvn exec:java -Dexec.args="put args in here"
4. How to run in Eclipse:
 1. File -> import -> Maven -> Existing Maven Projects  (then select restful-client to import)
 2. Open the restful-client project, open src/main to edit Main.java
 3. Run -> Configurations (then fill in the Arguments box as needed)
 4. Click the run icon
