import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Log4j_slf4j {

	private static final Logger Logger = LoggerFactory.getLogger(Log4j_slf4j.class);
	
	public static void main(String[] args) {
		Logger.info("start app");
		System.out.println("Hello World");
		
		int result = sum(2,2);
		System.err.println("2 + 2 is " + result);
		Logger.info("Result" + result);
		
		Logger.info("Finish app");
		// TODO Auto-generated method stub

	}
	public static int sum(int i,int j){
		return i+j;
	}

}
