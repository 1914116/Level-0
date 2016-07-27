import javax.swing.JOptionPane;

public class SimpleNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = JOptionPane.showInputDialog("Give me a number");
		int i = Integer.parseInt(num);
		String num2 = JOptionPane.showInputDialog("Give me a number");
		int n = Integer.parseInt(num2);
		String num3 = JOptionPane.showInputDialog("Give me a number");
		int x = Integer.parseInt(num3);
		if (i < n) {
			int t = i;
			i = n;
			n = t;
		}
		if (i < x) {
			int l = i;
			i = x;
			x = l;
		}
		if (x > n) {
			int k = x;
			x = n;
			n = k;
		}

		System.out.println(i);
		System.out.println(n);
		System.out.println(x);

	}

}
