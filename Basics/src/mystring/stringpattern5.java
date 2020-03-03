package mystring;

public class stringpattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="java";
		char c[]=new char[a.length()];
		for(int i=0;i<a.length();i++)
		{
			c[i]=a.charAt(i);
		}
		for(int i=0;i<c.length;i++)
		{
		 for(int j=0;j<=i;j++)
		 {
			 System.out.print(c[j]);
		 }
		 System.out.println();
		}
		

	}

}
