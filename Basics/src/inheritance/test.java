package inheritance;

public class test {

	public static void main(String[] args) {
		// overriding in multi level inheritence
		ccc obj = new ccc();
		obj.m();
		// overriding in hierarchial inheritence
		cc1 obj1 = new cc1();
		obj1.m();
		cc2 obj2 = new cc2();
		obj2.m();

	}

}
// overriding in muti level inheritence

class pcc {
	void m() {
		System.out.println("pc");
	}
}

class icc extends pcc {
	void m() {
		System.out.println("ic");
	}
}

class ccc extends icc {
	void m() {
		System.out.println("cc");
	}
}

// overriding in hirarcheal inheritance
class pcc1 {
	void m1() {
		System.out.println("pc1");
	}
}

class cc1 extends pcc1 {
	void m() {
		System.out.println("c1");
	}
}

class cc2 extends pcc1 {
	void m() {
		System.out.println("c2");
	}
}