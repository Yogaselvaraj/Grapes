package org.proj;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class task2 extends task {

	public static void main(String[] args)  {
		task t1=new task();
		//t1.empId(1);
		//t1.empName("Amniga");
		//t1.empPh(1234567890l);
		t1.empAdd("Adyar");
		t1.empDob("01-06-1999");
		t1.empGen('F');
		
		task t2=new task();
		//t2.empId(2);
		//t2.empName("Gayathri");
		//t2.empPh(9876543212l);
		t2.empAdd("Chennnai");
		t2.empDob("12-12-1979");
		t2.empGen('M');
		
		task t3=new task();
		t3.empId(90);
		t3.empName("Zara");
		t3.empPh(789874874l);
		t3.empAdd("Beasant");
		t3.empDob("11-09-1987");
		t3.empGen('F');
		
		task t4=new task();
		t4.empId(8);
		t4.empName("Pradeep");
		t4.empPh(26587458965l);
		t4.empAdd("Karnataka");
		t4.empDob("20-12-1954");
		t4.empGen('M');
		
		Map<String, Integer> objId=new LinkedHashMap<>();
		objId.put("Emp 1 ",t1.empId(20));
		objId.put("Emp 2 ",t2.empId(80));
		
		
		Map<String, String> objName=new LinkedHashMap<>();
		objName.put("Emp 1 ",t1.empName("Yoga"));
		objName.put("Emp 2 ",t2.empName("Gayathri"));
		
		Map<String,Long> objPh=new LinkedHashMap<>();
		objPh.put("Emp 1 ",t1.empPh(1234567890l));
		objPh.put("Emp 2 ",t2.empPh(9876543212l));
		
		Set<Entry<String, Integer>> estId = objId.entrySet();
		for(Entry<String,Integer> r1:estId) {
			System.out.println(r1.getKey());
			System.out.println("Employee Id: "+r1.getValue());
		}
		
		Set<Entry<String, String>> estName = objName.entrySet();
		for(Entry<String,String> r2: estName ) {
			System.out.println(r2.getKey());
			System.out.println("Employee Name: "+r2.getValue());
		}
		
		Set<Entry<String, Long>> estPh = objPh.entrySet();
		for(Entry<String,Long> r3:estPh) {
			System.out.println(r3.getKey());
			System.out.println("Enployee Phone: "+r3.getValue());
		}

	}

}
