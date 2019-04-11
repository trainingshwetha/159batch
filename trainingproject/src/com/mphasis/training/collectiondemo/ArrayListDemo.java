package com.mphasis.training.collectiondemo;
import java.util.*;
class ArrayListDemo {
	public static void main(String[] args) {
		
		
//		Map<Integer, String> m1=new TreeMap<>();
//		m1.put(12, "Meg");
//		m1.put(18, null);
//		m1.put(13, "manu");
//		
//		System.out.println(m1.get(12));
		
		
//		Queue<String> q1=new PriorityQueue<>();
//		q1.add("ss");
//		q1.add("xx");
//		q1.add("ses");
//		q1.add("xex");
//		q1.add("srs");
//		q1.add("xrx");
//		System.out.println(q1);
//		q1.peek();// point the head of the element
//		System.out.println(q1.peek());
//		q1.poll();//point and remove the head element
//		System.out.println(q1);
//		
//		
//		
//		Deque<String> dq=new ArrayDeque<>();
//		dq.add("dhsj");
//		dq.addLast("gfd");
//		dq.addFirst("hgdhjd");
//		System.out.println(dq);
//		
		
		
		List<Integer> l1= new LinkedList<>();
		l1.add(4534);
		l1.add(667879);
		l1.add(7346);
		l1.add(7346);
		l1.add(651237);
		l1.add(2, 6567);//insert value based on index
		System.out.println("list 1"+l1);
		l1.remove(2);//remove on index
		System.out.println("list 1"+l1);
		//l1.clear();//remove all elements
		//System.out.println("list l1"+ l1);
		Collections.sort(l1);//takes only list
		System.out.println("after sorting"+l1);
		
		Collections.shuffle(l1);//takes only list
		System.out.println("After shuffle "+l1);
		
		List<Integer> l2= new ArrayList<>();
		l2.add(456);
		l2.addAll(l1);
		System.out.println("list 2"+l2);
		l2.retainAll(l1);//retain only l1 elements
		System.out.println(" after remove list 2"+l2);
		l2.removeAll(l1);//remove only l1 elements
		System.out.println(l2);
		
		
		
		

	}

}
