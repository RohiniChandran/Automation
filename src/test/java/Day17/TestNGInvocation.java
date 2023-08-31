package Day17;

import org.testng.annotations.Test;

public class TestNGInvocation {
	  //invocationCount-If we need to run a method for more than one time it is used
	  //invocationTimeOut-It will give timeout of one second between each and every run 
      @Test(invocationCount=5,invocationTimeOut=1000)
      public void runtime()
      {
    	  System.out.println("To run a method for more than one time Invocation is used");
      }
	
	
	
	
	
}
