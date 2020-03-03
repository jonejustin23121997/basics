package inheritence;

public class XXX {
	int add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BB obj1=new BB();
		obj1.add(1,2,3);	
		CC obj=new CC();
		obj.add(1,2,2,2);
			
			}
}
class BB extends XXX{
	
		int add(int a, int b, int c)
	{
		 int d=a+b+c;
		System.out.println(d);
		return d;
		}
}
class CC extends XXX
{	
	int add(int a,int b,int c,int d)
	{
		int e=a+b+c+d;
		System.out.println(e);
		return e;
	}
	}
