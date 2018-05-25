package javalearn;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Learner {
	
	public void Lesson(String name){
		
		Method types[]=this.getClass().getMethods();
		for(Method type:types){
			if(type.getName().equals(name)){
				try {
					type.invoke(this, null);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
