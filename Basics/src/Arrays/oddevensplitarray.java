

package Arrays;

public class oddevensplitarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int b[] = new int[a.length];
		int c[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			if (a[i] % 2 == 0)
			{
				System.out.print(b[i] + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			if (a[i] % 2 != 0)
			{
				System.out.print(c[i] + " ");
			}
		}

	}

}
