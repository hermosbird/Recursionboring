import static org.junit.Assert.*;


import org.junit.Test;


public class RecursionFunTest {
	@Test
	public void testfactorial() {
		RecursionFun my = new RecursionFun();
		assertEquals(1, my.factorial(0));
		assertEquals(1, my.factorial(1));
		assertEquals(2, my.factorial(2));
		assertEquals(6, my.factorial(3));
		assertEquals(24, my.factorial(4));
	}

	@Test
	public void testfibonacci() {
		RecursionFun my = new RecursionFun();
		assertEquals(1, my.fibonacci(1));
		assertEquals(1, my.fibonacci(2));
		assertEquals(2, my.fibonacci(3));
		assertEquals(3, my.fibonacci(4));
		assertEquals(5, my.fibonacci(5));
		assertEquals(8, my.fibonacci(6));
	}

	@Test
	public void testaddReciprocals() {
		RecursionFun my = new RecursionFun();
		assertEquals(1.0, 0.001, my.addReciprocals(1));
		assertEquals(1.5, 0.001, my.addReciprocals(2));
		assertEquals(1.83333333333333, 0.001, my.addReciprocals(3));

	}

	@Test
	public void testGCD() {
		RecursionFun my = new RecursionFun();
		assertEquals(1, my.GCD(7, 5));
		assertEquals(7, my.GCD(14, 21));
		assertEquals(4, my.GCD(8, 4));
		assertEquals(3, my.GCD(24, 9));
		assertEquals(3, my.GCD(-24, 9));
		assertEquals(3, my.GCD(24, -9));
	}

	@Test
	public void testpairStar() {
		RecursionFun my = new RecursionFun();
		assertEquals("hel*lo", my.pairStar("hello"));
		assertEquals("x*xy*y", my.pairStar("xxyy"));
		assertEquals("a*a*a*a", my.pairStar("aaaa"));
	}

	@Test
	public void testnestParen() {
		RecursionFun my = new RecursionFun();
		assertEquals(true, my.nestParen("(())"));
		assertEquals(true, my.nestParen("((()))"));
		assertEquals(false, my.nestParen("(((x))"));
	}

	@Test
	public void testsumArray() {
		RecursionFun my = new RecursionFun();
		int[] x = { 1, 5, 7, 2, 3, 4 };
		assertEquals(0, my.sumArray(x, 5, 0));
		assertEquals(22, my.sumArray(x, 0, 5));
		assertEquals(13, my.sumArray(x, 0, 2));
		assertEquals(9, my.sumArray(x, 2, 3));
		assertEquals(7, my.sumArray(x, 2, 2));
		assertEquals(2, my.sumArray(x, 3, 3));
	}

	@Test
	public void testreverseArray() {
		RecursionFun my = new RecursionFun();
		int[] a = { 2, 4, 6 };
		my.reverseArray(a);
		assertEquals(6, a[0]);
		assertEquals(4, a[1]);
		assertEquals(2, a[2]);
		int[] b = { 2, 4, 6, 8 };
		my.reverseArray(b);
		assertEquals(2, b[3]);
		assertEquals(8, b[0]);
		assertEquals(4, b[2]);
		assertEquals(6, b[1]);
		
		int[] c = { 2, 4, 6, 8 ,9 };
		my.reverseArray(c);
		assertEquals(9, c[0]);
		assertEquals(8, c[1]);
		assertEquals(6, c[2]);
		assertEquals(4, c[3]);
		assertEquals(2, c[4]);
		
		

	}

	@Test
	public void testarrayRange() {
		RecursionFun my = new RecursionFun();
		assertEquals(2, my.arrayRange(new int[] { 1, 2, 3 }));
		assertEquals(2, my.arrayRange(new int[] { 3, 2, 1 }));
		assertEquals(0, my.arrayRange(new int[] { 3 }));
		assertEquals(3, my.arrayRange(new int[] { -3, -2, -5, -4 }));
	}



	@Test
	public void testbinarySearch() {
		RecursionFun my = new RecursionFun();
		String[] strs = { "Aaa", "Ccc", "Ddd", "Fff", "Hhh", "Ttt" };
		assertEquals(0, my.binarySearch("Aaa", strs));
		assertEquals(2, my.binarySearch("Ddd", strs));
		assertEquals(5, my.binarySearch("Ttt", strs));
		assertEquals(-1, my.binarySearch("Not Here", strs));
	}

	@Test
	public void testintWithCommas() {
		RecursionFun my = new RecursionFun();
		assertEquals("999", my.intWithCommas(999));
		assertEquals("1,234", my.intWithCommas(1234));
		assertEquals("1,007", my.intWithCommas(1007));
		assertEquals("1,023,004,567", my.intWithCommas(1023004567));
	}
}
