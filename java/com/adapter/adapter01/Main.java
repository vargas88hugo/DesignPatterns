package com.adapter.adapter01;

public class Main {

	public static void main(String[] args) {
		
		// Using class adapter
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		
		populateEmployeeData(adapter);
		
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
		
		System.out.println("==================================");
		
		// Using object adapter
		Employee employee = new Employee();
		
		populateEmployeeData(employee);
		
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		card = designer.designCard(objectAdapter);
		System.out.println(card);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
