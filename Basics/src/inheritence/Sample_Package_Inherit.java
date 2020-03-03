
package inheritence;

public class Sample_Package_Inherit 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		BBB obj1 = new BBB();
		CCC obj2 = new CCC();

		obj1.methodA();
		obj2.methodA();
	}
}
	class AAA
	{
	public void methodA()
	{
		System.out.println("Class A");
	}
	}
	
	class BBB extends AAA
	{
		public void methodB()
		{
			System.out.println("Class B Extends Class A");
		}
	}
	
	class CCC extends AAA
	{
		public void methodC()
		{
			System.out.println("Class C Extends Class A");
		}
	}



