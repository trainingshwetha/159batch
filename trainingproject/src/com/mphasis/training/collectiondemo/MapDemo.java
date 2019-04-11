package com.mphasis.training.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.mphasis.training.pojos.Employee;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap<>();
		hm.put(12, "Manisha");
		hm.put(13, "Nisha");
		hm.put(14, "Neemisha");
		hm.put(15, "Isha");
		System.out.println(hm);
		
		hm.replace(15, "Isha", "Moksha");
		System.out.println(hm);
		
		HashMap<Integer,Employee> employees=new HashMap<>();
		employees.put(1, new Employee(12, "Nishanth", 576687));
		employees.put(2, new Employee(13, "Rakesh", 586687));
		employees.put(3, new Employee(14, "Mahesh", 566687));
		employees.put(4, new Employee(15, "Amit", 596687));
		employees.put(5, new Employee(16, "Goutham", 586687) );
		System.out.println("employees hash map");
		//toString output
		System.out.println(employees);
		//custom output
		for(Map.Entry<Integer, Employee> entry:employees.entrySet())
		{
			int key=entry.getKey();
			Employee e1=entry.getValue();
			System.out.println("keys "+key+"\t values");
			System.out.println(e1.getEmpid()+" "+e1.getEnmae());
		}
		
		
	}

}
