package com.info.demo;

public class Month_Salary {
static int salary = 15000;
private void first_Month() {
	 salary=12000;
System.out.println("First Month :"+salary);
}
private void second_Month() {
System.out.println("Second Month :"+salary);
}
private void third_Month() {
int salary = 18000;
System.out.println("Third Month :"+salary);
}
public static void main(String[] args) {
	Month_Salary s = new Month_Salary();
	s.first_Month();
	s.second_Month();
	s.third_Month();
	
	int new_Salary=salary;
	System.out.println("New Salary :"+new_Salary);
}
}
