package org.calculator.tester;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	@DisplayName("Test should add numbers")
	public void resultShouldBeDouble() {
		Calculator calc = new Calculator();
		double result = calc.add(7.0, 9.0);

		assertEquals(16, result);

	}
	
	@Test
	@DisplayName("Test should subtract numbers")
	public void resultShouldBeDouble2() {
		Calculator calc = new Calculator();
		double result = calc.subtract(12.0, 6.0);

		assertEquals(6, result);

	}
	
	@Test
	@DisplayName("Test should divide numbers")
	public void resultShouldBeDouble3() {
		Calculator calc = new Calculator();
		double result = calc.divide(10.0, 5.0);

		assertEquals(2, result);

	}
	
	@Test
	@DisplayName("Test should multiply numbers")
	public void resultShouldBeDouble4() {
		Calculator calc = new Calculator();
		double result = calc.multiply(7.0, 8.0);

		assertEquals(56, result);

	}
	
	
	
	
	
	

}
