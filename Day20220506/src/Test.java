
public class Test {

	public static void main(String[] args) {
		Object obj = new B(new D());
		
		B b = (B)obj;
		
		System.out.println(b.dd.d);
	}

}

class F {}

class D {
	int d;
}

class A {
	int a;
	void func() {}
}

class B extends A {
	int b;
	D dd = new D();
	public B(Object o) {
		if (o instanceof D) {
			dd = (D)o;
			dd.d = 10;
		} else if(o instanceof F) {
			F f = (F)o;
		}
	}
}
