package mystring;

public class multipleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rAme@321";
		char a[] = new char[s.length()];
		System.out.println("alpahabets :");
		for (int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i);
			if (a[i] >= 65 && a[i] <= 90 || a[i] >= 97 && a[i] <= 123)
			{
				System.out.print(a[i]);
			}
		}
		System.out.println();
		System.out.print("numeric characters :");
		System.out.println();

		for (int i = 0; i < s.length(); i++) {
			if (a[i] >= 48 && a[i] <= 57) {
				System.out.print(a[i]);
			}
		}

		System.out.println();
		System.out.println("special characters :");

		for (int i = 0; i < s.length(); i++) {
			if (a[i] >= 21 && a[i] <= 47 || a[i] >= 58 && a[i] <= 64 || a[i] >= 91 && a[i] <= 96 || a[i] == 126) {
				System.out.print(a[i]);
			}
		}

		System.out.println();
		System.out.println("vowels in string :");

		char b[] = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])

				{
					System.out.println(a[i]);
				}
			}

		}

		System.out.println("upper case :");

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 65 && a[i] <= 90) {
				System.out.print(a[i]);
			}
		}

		System.out.println();
		System.out.println("lower case :");
		for (int i = 0; i < a.length; i++) {

			if (a[i] >= 97 && a[i] <= 123) {
				System.out.print(a[i]);
			}
		}

		System.out.println();
		System.out.println("count of @ :");
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ('@')) {

				count = count + 1;
			}

		}
		System.out.println(count);

		System.out.println("first char :");
		System.out.println(a[0]);
		System.out.println("last char :");
		System.out.println(a[a.length - 1]);
		System.out.println("middle char :");

		if (s.length() % 2 == 0) {
			System.out.println(a[s.length() / 2]);
			System.out.println(a[s.length() / 2 - 1]);
		} else {
			System.out.println(a[s.length() / 2]);
		}

	}
}
