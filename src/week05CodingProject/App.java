package week05CodingProject;

public class App {
	 public static void main(String[] args) {
	        // Instantiate logger classes
	        Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();
	        
	        // Test AsteriskLogger
	        System.out.println("Testing AsteriskLogger:");
	        asteriskLogger.log("Hello");
	        asteriskLogger.error("Hello");
	        
	        // Test SpacedLogger
	        System.out.println("\nTesting SpacedLogger:");
	        spacedLogger.log("Hello");
	        spacedLogger.error("Hello");
	    }

}
