package Arrays;

public class AuBuC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6, 7, 5, 1, 2, 3 };
		int c[] = { 9, 8, 10, 11, 5, 6 };
		int d[] = new int[a.length + b.length + c.length];
		for (int i = 0; i < a.length; i++) {
			d[i] = a[i];
		}
		int temp = 0;
		for (int i = a.length; i < a.length + b.length; i++) {
			d[i] = b[temp];
			temp = temp + 1;
		}
		temp = 0;

		for (int i = a.length + b.length; i < d.length; i++) {
			d[i] = c[temp];
			temp = temp + 1;
		}

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
