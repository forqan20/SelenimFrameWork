package listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGListeners implements ITestListener {
	    @Test	
	    public void onTestStart(ITestResult  result ) {	
	    	System.out.println("***** Test is  started :"+result.getName()); 		
	    }		

	    @Test	
	    public void onTestSuccess(ITestResult result) {		
	    	System.out.println("***** Test is  sucessful :"+result.getName()); 	
	        			
	        		
	    }		

	    @Test		
	    public void onTestFailure(ITestResult result) {					
	    	System.out.println("***** Test is passed :"+result.getName()); 			
	        		
	    }		

	    @Test 	
	    public void onTestSkipped(ITestResult result) {		
	    	System.out.println("***** Test is  skipped :"+result.getName()); 	
	     			
	    }		

	    @Test		
	    public void onTestFinish(ITestResult result) {	
	    	System.out.println("***** Test is Finished  :"+result.getName()); 	
	       		
	        		
	    }		

	 		
	        		
	    }		
	
	
	
	
	

	
	

