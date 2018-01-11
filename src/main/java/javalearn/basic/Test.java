package javalearn.basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.setName("zcj");
		
		B b=new B();
		b.setA(a);
		a.setName("mht");
		B b2=new B();
		b2.setA(a);
		
		System.out.print(b.getA().getName()+"---"+b2.getA().getName());
	}

}
