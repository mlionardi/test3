

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
	
   public void testAdd() {
      String str = "Junit is not working fine";
      assertEquals("Junit is working fine",str);
   }
}

