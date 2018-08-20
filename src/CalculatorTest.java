

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	class Calculator {
		public int evaluate(String expression) {
			int sum = 0;
			for (String summand : expression.split("\\+"))
				sum += Integer.valueOf(summand);
			return sum;
		}
	}

	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}
}