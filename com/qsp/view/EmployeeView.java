package com.qsp.view;

import java.util.List;
import java.util.Scanner;

import com.qsp.controller.EmployeeController;
import com.qsp.model.Employee;

public class EmployeeView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeController controller = new EmployeeController();
		do {
			System.out.println("1.add Employee");
			System.out.println("2.delete Employee by id");
			System.out.println("3.update Employee");
			System.out.println("4.fetch Employee by id");
			System.out.println("5.fetch all Employee");
			System.out.println("6.exit");
			switch (sc.nextInt()) {
			case 1: {
				Employee e = new Employee();
				System.out.println("enter id");
				e.setId(sc.nextInt());
				System.out.println("enter name");
				e.setName(sc.next());
				System.out.println("enter phone");
				e.setPhone(sc.nextLong());
				System.out.println("enter sal");
				e.setSal(sc.nextDouble());
				controller.addEmployee(e);
				System.out.println("added------!");
			}
				break;
			case 2: {
				System.out.println("enter id");
				controller.deleteEmployee(sc.nextInt());
			}

				break;
			case 3: {
				System.out.println("enter id");
				int id = sc.nextInt();
				System.out.println("enter new sal");
				double newSal = sc.nextDouble();
				controller.updateEmployeeSal(id, newSal);
				System.out.println("updated-----!");
			}

				break;
			case 4: {
				System.out.println("enter id");
				Employee e = controller.getEmployeeById(sc.nextInt());
				System.out.println(e);
			}

				break;
			case 5: {
				List<Employee> list = controller.getAll();
				for (Employee employee : list) {
					System.out.println(employee);
					System.out.println("-------------------");
				}
			}
			case 6: {
				controller.closeConnection();
				System.out.println("tata bye bye see u later");
				System.exit(0);
			}

				break;

			default:
				System.out.println("invalid input");
			}
			System.out.println("enter y to continue");
		} while (sc.next().equalsIgnoreCase("y"));
	}
}
