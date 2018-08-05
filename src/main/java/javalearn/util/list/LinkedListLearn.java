package javalearn.util.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("茄子");
		list.add("西瓜");
		list.add("葡萄");
		list.add("苹果");
		list.add("栗子");
		list.add("猕猴桃");
		
		list.listIterator(2).add("木瓜");

		ListIterator<String> li=list.listIterator();
		
		while(li.hasNext()) {
			if(li.hasPrevious()) {
				System.out.println("上一个"+list.get(li.previousIndex()));
			}
			

			String name=li.next();
			System.out.println(name);
			if(name.equals("苹果")) {
				li.add("香蕉");
				
			}
		}
		
		System.out.println(list);
		
		
	}

}
