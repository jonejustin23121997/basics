package Arrays;

public class splitarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int b[] = new int[a.length / 2];
		int c[] = new int[a.length / 2];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		System.out.println();
		int temp = b.length;
		for (int i = 0; i < c.length; i++) {
			c[i] = a[temp];
			temp = temp + 1;
			System.out.print(c[i] + " ");
		}

	}

}
