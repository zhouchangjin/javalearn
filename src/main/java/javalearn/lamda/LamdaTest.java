package javalearn.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOwnCallback a=(String test)->System.out.println(test);
		a.Test("f");
		
		//����ʽ��̣����ص������ļ�д��
		TestCallback((String test)->System.out.println(test), "���");
		
		//��ʽ���
		List<Integer> arrayList=new ArrayList<Integer>();
		for(int i=0;i<100;i++){
			arrayList.add(i);
		}
		long cnt=arrayList.stream().filter(num->num%3==0).count();
		System.out.println(cnt);
	}
	
	public static void TestCallback(MyOwnCallback test,String passingParam){
		test.Test(passingParam);
	}

}


