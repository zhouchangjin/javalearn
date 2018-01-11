package javalearn.clone;

public class Car extends Entity{
	
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public Car clone(){
		try {
			return (Car) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return new Car();
		}
	}

}
