package mycalculator;
import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNFactorial0() {
		MyCalculator c = new MyCalculator();
		int actual = c.nfactorial(0);
		assertEquals("0! = 1", 1 ,actual , 0.0);
	}
	@Test
	public void testNFactorialneg1() {
		MyCalculator c = new MyCalculator();
		int actual = c.nfactorial(-1);
		assertEquals("-1 = -1", -1 ,actual , 0.0);
	}
	@Test
	public void testNFactorialneg9() {
		MyCalculator c = new MyCalculator();
		int actual = c.nfactorial(-9);
		assertEquals("-9! = -362880", -1 ,actual , 0.0);
	}
	@Test
	public void testNFactorial3() {
		MyCalculator c = new MyCalculator();
		int actual = c.nfactorial(3);
		assertEquals("3! = 6", 6 ,actual , 0.0);
	}
	@Test
	public void testNFactorial4() {
		MyCalculator c = new MyCalculator();
		int actual = c.nfactorial(4);
		assertEquals("4! = 24", 24 ,actual , 0.0);
	}
	@Test
	public void testNFactorial12() {
		MyCalculator c = new MyCalculator();
		int actual = c.nfactorial(12);
		assertEquals("12! = 479001600", 479001600 ,actual , 0.0);
	}
	
	
	@Test
	public void testBinarySearch12() {
		MyCalculator c = new MyCalculator();
		int a[] = {-1, 0, 5, 6, 9, 13};
		int actual = c.binarySearch(a, 12);
		assertEquals("12 is not in the array", -1 ,actual , 0.0);
	}
	
	@Test
	public void testBinarySearch5a() {
		MyCalculator c = new MyCalculator();
		int a[] = {-1, 0, 6, 13, 9, 5};
		int actual = c.binarySearch(a, 5);
		assertEquals("5 is in the array but in the wrong index", -1 ,actual , 0.0);
	}
	
	@Test
	public void testBinarySearc5b() {
		MyCalculator c = new MyCalculator();
		int a[] = {-1, 0, 5, 6, 9, 13};
		int actual = c.binarySearch(a, 5);
		assertEquals("5 is in the array, index 2", 2 ,actual , 0.0);
	}
	
	@Test
	public void testBinarySearchneg8() {
		MyCalculator c = new MyCalculator();
		int a[] = {-1, 0, 5, 6, 9, 13};
		int actual = c.binarySearch(a, -8);
		assertEquals("-8 is not in the array", -1 ,actual , 0.0);
	}
	@Test
	public void testBinarySearch9() {
		MyCalculator c = new MyCalculator();
		int a[] = {-1, 0, 5, 6, 9, 13};
		int actual = c.binarySearch(a, 9);
		assertEquals("9 is in the array", 4 ,actual , 0.0);
	}
	@Test
	public void testBinarySearchNULL() {
		MyCalculator c = new MyCalculator();
		int a[] = null;
		int actual = c.binarySearch(a, -8);
		assertEquals("Null array", -1 ,actual , 0.0);
	}
	@Test
	public void testBinarySearchEmptyArray() {
		MyCalculator c = new MyCalculator();
		int a[] = new int[] { } ;
		int actual = c.binarySearch(a, -8);
		assertEquals("Empty array", -1 ,actual , 0.0);
	}

}
