package javalearn.math;

import javalearn.Learner;
import javalearn.LearnTest;

public class MathLearner extends Learner{
	
	@LearnTest
	public void ModTest(){
		System.out.println("start");
		System.out.println("1%3="+1%3);
		System.out.println("3%1="+3%1);
		System.out.println("0%10="+0%10);
		System.out.println("-3%10="+(-3%10));
		System.out.println("-7%3="+(-7%3));
		System.out.println(Integer.MIN_VALUE%8);
	}

}
