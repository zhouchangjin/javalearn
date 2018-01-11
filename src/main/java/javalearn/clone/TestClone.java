package javalearn.clone;

public class TestClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.setId("1");
		car.setType("mar");
		Car car2=car.clone();
		System.out.println(car.getType());
	}

}
