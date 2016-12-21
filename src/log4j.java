import org.apache.log4j.Logger;
import org.apache.log4j.FileAppender;






public class log4j{

	final static Logger logger = Logger.getLogger(log4j.class);
	public static void main(String[] args) {

		log4j obj = new log4j();
		obj.runMe("Hello");

	}

	private void runMe(String parameter){

		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

}