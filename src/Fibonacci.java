
public class Fibonacci {
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);

		while (c <= 144) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}

}
