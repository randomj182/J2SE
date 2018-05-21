package com.random.standard;
/**
 * 测试静态方法和静态域
 * @author random
 *
 */
public class StaticTest {
	public static void main(String[] args) {
		Employee1[] staff = new Employee1[3];
		
		staff[0] = new Employee1("Tom", 40000);
		staff[1] = new Employee1("Random", 50000);
		staff[2] = new Employee1("Radish", 100000);
		
		for (Employee1 e : staff) {
			e.setId();
			System.out.println("name=" +e.getName() 
			+",id = " +e.getId()+",salary=" +e.getSalary());
		}
		int n = Employee1.getNextId();
		System.out.println("Next avaliable id="+n);
	}
}
/*
 * Employee1类,有一个静态域nextId和一个静态方法getNextId方法
 */
class Employee1{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	public Employee1(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = 0;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		id = nextId;
		nextId++;
	}
	public static int getNextId() {
		return nextId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		Employee1 e = new Employee1("Harry", 50000);
		System.out.println(e.getName()+ " " +e.getSalary());
	}
}
