package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.MessageUtil;

public class TestJunit {
	
   String message = "Test";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}


