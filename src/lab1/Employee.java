package lab1;

import java.util.*;

public class Employee {
	private int id;
	private String ename;
	
	public Employee(int id, String ename) {
		this.id = id;
		this.ename = ename;
	}
	
	public int getId() {
		return id;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + "]";
	}
	
	
	public static void main(String args[]) {
		
		Employee e1=new Employee(1,"a");
		Employee e2=new Employee(2,"b");
		Employee e3=new Employee(3,"c");
		Employee e4=new Employee(4,"d");
		Employee e5=new Employee(5,"e");
		
		List<Employee> elist=new ArrayList<>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		System.out.println("list");
		for(Employee e:elist) {
			System.out.println(e);
		}
		
		Set<Employee> es=new HashSet<>();
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		System.out.println("Set");
		for(Employee e:es) {
			System.out.println(e);
		}
		
		
		Map<Integer,Employee> em=new HashMap<>();
		em.put(e1.getId(), e1);
		em.put(e2.getId(), e2);
		em.put(e3.getId(), e3);
		em.put(e4.getId(), e4);
		em.put(e5.getId(), e5);
		
		System.out.println("Map");
		System.out.println(em.toString());
		
		
		
		
		
		
	}

}
