package com.ob.ess_portal_application_development;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Manager_leave {

	public static void reqests(Employee find) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("insert");
		EntityManager manager = managerFactory.createEntityManager();
//		manager.persist(entity);
//		transaction.commit();
		System.out.println("Hi " + find.getEmp_name());
		System.out.println("Enter the option for the following operation");
		while (true) {
			System.out.println("1.Show All Leave request\n2.Approve/Reject leave request\n3.Logout");
			Scanner scan = new Scanner(System.in);
			int option = scan.nextInt();
			if (option == 1) {
				System.out.println("All leave request");
				Query query = manager.createQuery("from Leave ");
				List list = query.getResultList();
				if (list != null) {
					Iterator<Leave> iterator = list.iterator();
					while (iterator.hasNext()) {
						Leave next = iterator.next();
						System.out.println(next);
					}
				}
			}
			if (option == 2) {
				System.out.println("Enter the serial number :");
				Leave find2 = manager.find(Leave.class, scan.nextInt());
				EntityTransaction transaction = manager.getTransaction();
				System.out.println(find2.getEmployee_id());
				transaction.begin();
				System.out.println("1.Approve\n2.Reject");
				int choice = scan.nextInt();
				if (choice == 1) {
					find2.setLeave_sts("Approved");
				}
				if (choice == 2) {
					find2.setLeave_sts("Rejected");
				}
				if (choice > 2) {
					System.out.println("Invalid");
				}
				manager.persist(find2);
				transaction.commit();
			}
			if (option == 3) {
				break;
			}
			if (option > 3) {
				System.out.println("Invalid");
			}
		}

	}

}
