import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {
	
	 private static final Logger slf4jLogger = LoggerFactory.getLogger(Logback.class);
	 
	 
	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        slf4jLogger.trace("Hello World!");
	         
	        String name = "Pranita";
	        int rollno = 10;
	        slf4jLogger.debug("Hi, {}, Roll no: {} ", name,rollno);
	        slf4jLogger.info("HELLLO INFO");
	        slf4jLogger.warn("Hello warning message.");
	        slf4jLogger.error("Hello error message.");
	    }
	}	

