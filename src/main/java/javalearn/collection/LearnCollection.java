package javalearn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollection {
	

	public static void main(String[] args) {
		
		List<Float> list=new ArrayList<Float>(); 
		
		list.add(1.1f);
		list.add(1.0f);
		list.add(1.3f);
		
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
