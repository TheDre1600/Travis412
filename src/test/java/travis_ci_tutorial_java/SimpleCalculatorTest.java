package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 0);
	}
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(5, 3), 2);
	}
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(2, 1), 2);
	}
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(4, 2), 2);
	}
	public void testDivideZero() {
	SimpleCalculator calc = new SimpleCalculator();
	assertEquals(calc.add(1, 0), 0);
}
}
