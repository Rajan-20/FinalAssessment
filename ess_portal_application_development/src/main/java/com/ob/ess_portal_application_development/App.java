package com.ob.ess_portal_application_development;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	private static void register(Employee emp) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Registeration");
		System.out.println("Enter the Employee id :");
		emp.setId(scan.nextInt());
		System.out.println("Enter the employee name :");
		emp.setEmp_name(scan.next());
		System.out.println("Enter the type of Employee :");
		emp.setEmp_type(scan.next());
		System.out.println("Enter the mail id of the Employee :");
		emp.setEmail(scan.next());
		System.out.println("Enter the password");
		emp.setPassword(scan.next());
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("insert");
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(emp);
		transaction.commit();
		
	
	}
	private static void login(Employee emp) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Login");
		System.out.println("Enter the Employee id :");
		int id = scan.nextInt();
		System.out.println("Enter the password :");
		String password = scan.next();
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("insert");
		EntityManager manager = managerFactory.createEntityManager();
		Employee find = manager.find(Employee.class, id);

		try {
			
		if (find.getPassword().contentEquals(password)) {
			System.out.println("login successfully");
			if(find.getEmp_type().contentEquals("manager")||find.getEmp_type().contentEquals("Manager") ||find.getEmp_type().contentEquals("MANAGER")) {
				System.out.println("Manager");
				Manager_leave.reqests(find);
			}
			if (find.getEmp_type().contentEquals("employee")||find.getEmp_type().contentEquals("Employee")||find.getEmp_type().contentEquals("EMPLOYEE")) {
			System.out.println("Employee");
			Employee_leave.workers(find);
			}
		}else {
			System.err.println("Invalid password");
		}
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("No user found! create new account");
		}
		
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		while(true) {
		System.out.println("================ESS PORTAL===============");
		System.out.println("Enter the number for the following operation");
		System.out.println("1.Registeration\n2.Login");
		Scanner scan = new Scanner(System.in);
		int option=0;
		try {
		option = scan.nextInt();
		}catch (Exception e) {
			System.out.println("Press the correct option");
			continue;
		}
		switch (option) {
		case 1: {
			register(employee);
			break;
		}
		case 2: {
			login(employee);
			break;
		}
		default :{
			System.out.println("Options are invalid!!!");
			break;
		}

		}
	}

	}
}
