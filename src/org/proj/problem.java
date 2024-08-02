package org.proj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class problem {

	public static void main(String[] args) {
		
		//Hashmap accepts null in both key and values
		//Random order
		//iteration just sysout is enough to print both keys and values
		
		Map<String,Long> m1=new HashMap<>();
		m1.put("Naina", 9489587871l);
		m1.put("yoga", 8300194956l);
		m1.put("mom",9489587871l);
		m1.put("yarao", null);
		m1.put(null, 1234567890l);
		//m1.put(null, null);
		
		System.out.println(m1);
		Long l = m1.get(null);
		System.out.println(l);
		
		//LinkedHashMap accepts null in both keys and value
		//insertion order
		//iteration just sysout is enough to print both keys and values
		
		Map<String, Integer> m2=new LinkedHashMap<>();
		m2.put("India", 100);
		m2.put("Australia", 1090);
		m2.put("England", 10);
		m2.put(null, 100);
		m2.put("UK", null);
		m2.put(null, null);
		m2.put("Pakistan", 555);
		
		System.out.println(m2);
		m2.remove("India");
		System.out.println("-------------------------");
		System.out.println(m2);
	
		
		//TreeMap doesnt accept null in key
		//iteration in ascending order according to keys
		
		Map<Integer,String> m3=new TreeMap<>();
		m3.put(100, "sathiya");
		m3.put(138, "Akshya");
		m3.put(65, "Preethi");
		//m3.put(null, "pranav");
		m3.put(333, null);
		//m3.put(null, null);
		
		System.out.println(m3);
		Collection<String> vv = m3.values();
		for(String t: vv) {
			System.out.println(t);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
		
		Set<Integer> dd = m3.keySet();
		for(Integer i:dd) {
			System.out.println(i);
		}
		
		Map<String,Integer> m4=new TreeMap<>();
		m4.put( "sathiya",89);
		m4.put("zkshya",10);
		m4.put("Preethi",65);
		//m3.put(null, "pranav");
		m4.put("kavin",null);
		
		System.out.println(m4);
		Set<String> j = m4.keySet();
		for(String k:j) {
			System.out.println(k);
		}
		
		//HashTable doesnt allow null in both keys and values
		//Random order
		
		Map<Character, String> m5=new Hashtable<>();
		m5.put('T', "India");
		m5.put('S', "Kenya");
		m5.put('A', "ndia");
		m5.put('T', "Japan");
		m5.put('A',"London");
		m5.put('T', "south korea");
		
		System.out.println(m5);
		boolean y = m5.containsKey('T');
		System.out.println(y);
		
		boolean n = m5.containsValue("Kenya");
		System.out.println(n);
		
		String r = m5.get('S');
		System.out.println(r);
		
		 
		
		
		

	}

}
