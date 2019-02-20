package javalearn;

public class LearnExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isbnTest="97817";
		
		System.out.println(isbnTest.matches("[0-9]*"));
		System.out.println(isbnTest.matches("^\\d+$"));

	}

}
