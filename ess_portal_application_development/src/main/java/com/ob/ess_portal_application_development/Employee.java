package com.ob.ess_portal_application_development;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_Info")
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Employee_Id")
	private int id;
	@Column(name="Employee_Name",length = 50)
	private String emp_name;
	@Column(name="Employee_Type")
	private String emp_type;
	@Column(name="Email",length = 100)
	private String email;
	@Column(name="Password",length = 50)
	private String password;
}
