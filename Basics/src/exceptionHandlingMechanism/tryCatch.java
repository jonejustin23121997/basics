package exceptionHandlingMechanism;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 0;
		Integer t = 5;
		Integer d = new Integer(5);
		int c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("i ll always execute");
		}
		System.out.println("bye");
		String g="payilagam";

		for (int i = 0; i <= g.length(); i++) {
			System.out.println(g + "\t" + Integer.toHexString(i));
		}
	}

}
