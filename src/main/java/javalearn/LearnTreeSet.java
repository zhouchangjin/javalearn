package javalearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Float> treeSet=new TreeSet<Float>();
		treeSet.add(1.0f);
		treeSet.add(0.8f);
		treeSet.add(2.0f);
		treeSet.add(0.9f);
		
//		Iterator<Float> it=treeSet.descendingIterator();
//		while(it.hasNext()) {
//			//System.out.println(it.next());
//		}
//		
		
		ArrayList<Float> list=new ArrayList<Float>();
		list.add(1.1f);
		list.add(2.1f);
		list.add(2.3f);
		list.add(1.3f);
		
		Collections.sort(list);

		Collections.sort(list);
		
	}

}
