import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public final void testAdd() {
		int a = 1234;
		int b = 8765;
		CalculateTest cal = new CalculateTest();
	    int actual = cal.add(a,b);
	    int expected = 9999;
	    assertEquals(expected,actual);
	}
	@Test
	public final void testSubtract() {
		int a = 1234;
		int b = 8765;
		CalculateTest cal = new CalculateTest();
	    int actual = cal.subtract(a,b);
	    int expected = -7531;
	    assertEquals(expected,actual);
	}
	@Test
	public final void testMultiply() {
		int a = 1234;
		int b = 8765;
		CalculateTest cal = new CalculateTest();
	    int actual = cal.multiply(a,b);
	    int expected = 10816010;
	    assertEquals(expected,actual);
	}
	@Test
	public final void testDivide() {
		int a = 100;
		int b = 5;
		CalculateTest cal = new CalculateTest();
	    int actual = cal.divide(a,b);
	    int expected = 20;
	    assertEquals(expected,actual);
	}

	@After
	public void tearDown() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
}
