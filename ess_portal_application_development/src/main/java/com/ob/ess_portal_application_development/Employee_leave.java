package com.ob.ess_portal_application_development;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Employee_leave {

	public static void workers(Employee find) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("insert");
		EntityManager manager = managerFactory.createEntityManager();
		System.out.println("Hi " + find.getEmp_name());
		while (true) {
			System.out.println("Enter the option for following operation");
			System.out.println("1.Status of Leave Request\n2.Request for a leave\n3.Logout");
			Scanner scan = new Scanner(System.in);
			int option = scan.nextInt();
			if (option == 1) {
				Query query = manager.createQuery("from Leave where Employee_id=:i");
				query.setParameter("i", find.getId());
				List<Leave> list = query.getResultList();
				if (list != null) {
					Iterator<Leave> iterator = list.iterator();
					while (iterator.hasNext()) {
						Leave next = iterator.next();
						System.out.println(next);
					}
				}

			}
			if (option == 2) {
				Leave leave = new Leave();
				System.out.println("Enter the date for leave request :");
//			Scanner scan = new Scanner(System.in);
				leave.setLeave_date(scan.next());
				leave.setEmployee_id(find.getId());
				leave.setLeave_sts("Pending");
				EntityTransaction transaction = manager.getTransaction();
				transaction.begin();
				manager.persist(leave);
				transaction.commit();
			}
			if (option == 3) {
				break;
			}
			if (option > 3) {
				System.out.println("invalid");
			}
		}

	}

}
