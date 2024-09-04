package week05CodingProject;

public class AsteriskLogger implements Logger {
	 @Override
	    public void log(String message) {
	        // Print message between three asterisks on either side
	        System.out.println("***" + message + "***");
	    }

	    @Override
	    public void error(String message) {
	        // Print message inside a box of asterisks with "ERROR:" prefix
	        String border = "*".repeat(message.length() + 12); // Adjust border length
	        System.out.println(border);
	        System.out.println("***Error: " + message + "***");
	        System.out.println(border);
	    }

}
