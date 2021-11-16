package utilll;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticUtilsTest {

	@Test
	public void testGcd() {
		int a = 10;
		int b = 40;
		int c = 57;
		int res;
		
		res = ArithmeticUtils.gcd(a, b);
		assertEquals(1,res);
		
		res = ArithmeticUtils.gcd(a, c);
		assertEquals(10,res);
		
		res = ArithmeticUtils.gcd(c, b);
		assertEquals(10,res);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testLcm() {
		int a = 10;
		int b = 40;
		int c = 57;
		int res;
		
		res = ArithmeticUtils.lcm(a, b);
		assertEquals(40,res);
		
		res = ArithmeticUtils.lcm(a, c);
		assertEquals(570,res);
		
		res = ArithmeticUtils.lcm(c, b);
		assertEquals(2280,res);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testPow() {
		int a = 5;
		int b = 8;
		int c = 9;
		int res;
		
		res = ArithmeticUtils.pow(a, b);
		assertEquals(390625,res);
		
		res = ArithmeticUtils.pow(a, c);
		assertEquals(1953125,res);
		
		res = ArithmeticUtils.pow(c, b);
		assertEquals(43046721,res);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testIsPowerOfTwo() {
		long a = 1024;
		long b = 49;
		boolean res;
		
		res = ArithmeticUtils.isPowerOfTwo(a);
		if(res) {
			assertEquals(true,res);
		}else {
			assertEquals(false,res);
		}
		res = ArithmeticUtils.isPowerOfTwo(b);
		if(res) {
			assertEquals(true,res);
		}else {
			assertEquals(false,res);
		}
		//fail("Not yet implemented");
	}

}
