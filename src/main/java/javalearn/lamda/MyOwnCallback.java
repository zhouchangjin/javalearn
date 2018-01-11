package javalearn.lamda;

public interface MyOwnCallback {
	
	public void Test(String args);
	
	/**
	 * 使用函数式编程的接口必须为functional interface，也就是只有一个方法。
	 * 不能有多个方法
	public void Test2(String args,int num);
	**/
}
