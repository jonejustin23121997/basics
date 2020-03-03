package inheritence;

public class Ovlhi {
	int add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G obj1=new G();
		obj1.add(1,2,3);	
		M obj=new M();
		obj.add(1,2,2,2);
			
			}
}
class G extends Ovlhi{
	
		int add(int a, int b, int c)
	{
		 int d=a+b+c;
		System.out.println(d);
		return d;
		}
}
class M extends Ovlhi
{	
	int add(int a,int b,int c,int d)
	{
		int e=a+b+c+d;
		System.out.println(e);
		return e;
	}
	}
