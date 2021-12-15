package week10;

public class A {
	class B {
		B(){
			
		}
		int field1;
		void method1() {
			
		}
		static class C{
			C() {};
			int field1;
			static int field2;
			void method1() {};
			static void method2() {};
		}
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
	}
	}}

