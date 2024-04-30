package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class EmployeeInitializer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d%n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(employee, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employee.add(i, new Employee(id, name, salary));
		}

		System.out.print("Enter the emplyee id that will have salary increase: ");
		n = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double increase = sc.nextDouble();
		int index = -1;

		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i).getId() == n) {
				employee.get(i).increaseSalary(increase);
				index = n;
			}
		}

		if (index == -1) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		
		System.out.println("list of employees:");
		for (Employee e : employee) {
			System.out.println(e);
		}

		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
