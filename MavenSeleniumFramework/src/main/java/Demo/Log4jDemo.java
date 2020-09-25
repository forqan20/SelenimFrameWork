package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		System.out.println("\n Hello World ...! \n");
		logger.trace("This is a trace massage ");
		logger.info("this is  informatiom massage");
		logger.error("this is error massage ");
		logger.warn("This is a warring massage");
		logger.fatal("This is a fatal massage ");
		System.out.println("Completed ");
		
	

	}

}
