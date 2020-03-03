package inheritence;

public class OverloadingInmultilevelInheritence {
		int add(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
			return c;
			
		}
	public static void main(String[] args) {
		C obj=new C();
		obj.add(1,2);
		obj.add(1,2,3);
		obj.add(1,2,3,4);
		
		
		// TODO Auto-generated method stub

	}

}
class V extends OverloadingInmultilevelInheritence 
{	int add(int a, int b, int c)
	{
		 int d=a+b+c;
		System.out.println(d);
		return d;
		
	}
}
class C extends   V
{
	int add(int a,int b,int c,int d)
	{
		int e=a+b+c+d;
		System.out.println(e);
		return e;
		
}

}