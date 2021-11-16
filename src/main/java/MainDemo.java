import utilll.ArithmeticUtils;

class MainDemo
{
	public static void main(String[] args)  
	{
		//����ArithmeticUtils���е�gcd����
		int a = 10;
		int b = 40;
		int c = 57;
		int res;
		
		res = ArithmeticUtils.gcd(a, b);
		System.out.println(a+"��"+b+"�����Լ����"+res);
		
		res = ArithmeticUtils.gcd(a, c);
		System.out.println(a+"��"+c+"�����Լ����"+res);
		
		res = ArithmeticUtils.gcd(c, b);
		System.out.println(c+"��"+b+"�����Լ����"+res);
		
		//����ArithmeticUtils���е�lcm����
		a = 10;
		b = 40;
		c = 57;
		
		res = ArithmeticUtils.lcm(a, b);
		System.out.println(a+"��"+b+"����С��������"+res);
		
		res = ArithmeticUtils.lcm(a, c);
		System.out.println(a+"��"+c+"����С��������"+res);
		
		res = ArithmeticUtils.lcm(c, b);
		System.out.println(c+"��"+b+"����С��������"+res);
		
		//����ArithmeticUtils���е�pow����
		a = 5;
		b = 8;
		c = 9;
		
		res = ArithmeticUtils.pow(a, b);
		System.out.println(a+"��"+b+"�η���"+res);
		
		res = ArithmeticUtils.pow(a, c);
		System.out.println(a+"��"+c+"�η���"+res);
		
		res = ArithmeticUtils.pow(c, b);
		System.out.println(c+"��"+b+"�η���"+res);
		
		
		//����ArithmeticUtils���е�IsPowerOfTwo����
		long x = 1024;
		long y = 49;
		boolean rest;
		
		rest = ArithmeticUtils.isPowerOfTwo(x);
		if(rest) {
			System.out.println(x+"��2�Ĵη�");
		}else {
			System.out.println(x+"����2�Ĵη�");
		}
		rest = ArithmeticUtils.isPowerOfTwo(y);
		if(rest) {
			System.out.println(y+"��2�Ĵη�");
		}else {
			System.out.println(y+"����2�Ĵη�");
		}
	}
}
