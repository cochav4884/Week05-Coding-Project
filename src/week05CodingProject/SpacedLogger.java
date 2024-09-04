package week05CodingProject;

public class SpacedLogger implements Logger {
	  @Override
	    public void log(String message) {
	        // Print message with spaces between characters
	        System.out.println(String.join(" ", message.split("")));
	    }

	    @Override
	    public void error(String message) {
	        // Print message with spaces and "ERROR:" prefix
	        String spacedMessage = String.join(" ", message.split(""));
	        System.out.println("ERROR: " + spacedMessage);
	    }

}
