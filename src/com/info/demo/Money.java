package com.info.demo;

public class Money {
	final int expense=1500;
	private void first_Day() {
		int expense = 1000;
System.out.println("1st day expense :"+expense);
	}
	private void second_Day() {
int expense = 1250;
System.out.println("2nd day expense :"+expense);
	}
private void third_Day() {
System.out.println("3rd day expense :"+expense);
}
public static void main(String[] args) {
	Money s = new Money();
	s.first_Day();
	s.second_Day();
	s.third_Day();
	int fourth_day=s.expense;
	System.out.println("4th day expense :"+fourth_day);
}
}
