package otherprogram;

// Multiple Inheritance
interface Q{
	public void m(); // No implementation, check Child class
}

interface R {
	public void m(); // No implementation, check Child class
}
 
class S implements Q, R { // Two parent and one child --> Multiple Inheritance
	public void m() {
		System.out.println("Hi");
	}
}

public class interface_program {
	public static void main(String[] args) {
		Q x = new S(); // Dynamic binding
		x.m();
		R y = new S();  // Dynamic binding
		y.m();
		S z = new S();  // Static binding
		z.m();
	}
}