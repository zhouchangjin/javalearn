package javalearn.math;

public class TestTemp {
	int a;
	int b;
	int p=17;
	int d=2753;
	
	public TestTemp(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public long encript(int we,int e,int n) {
		long pow= (long)Math.pow(we*1.0,n*1.0);
		return pow%e;
	}
	
	public long decript(int de,int e,int n) {
		long pow=(long)Math.pow(de*1.0, n*1.0	);
		return pow%e;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=7;
		TestTemp t=new TestTemp(a,b);

		System.out.println(t.encript(8, 21, 17));
		System.out.println(t.decript(8,21,5));
		
	}
	
	public int getN() {
		return a*b;
	}
	
	public int getP() {
		return (a-1)*(b-1);
	}

}
