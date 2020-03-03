package inheritence;

public class Abstraction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();
		obj.m();

	}}

	abstract class A
	{
		int add(int a, int b, int c)
		{
			 int d=a+b+c;
			System.out.println(d);
			return d;
			
		}
		abstract void m();
		
	}
	

class  B extends A
{
	void m(){
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
}
