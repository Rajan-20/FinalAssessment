package com.ob.ess_portal_application_development;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name="EmployeeLeave_Info")
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "S_No")
	private int s_no;
//	@Column(name="Employee_ID")
	private int Employee_id;
	@Column(name="Leave_Date")
	private String leave_date;
	@Column(name="Leave_Status")
	private String leave_sts;
	
	public Leave(int employee_id, String leave_date, String leave_sts) {
		Employee_id = employee_id;
		this.leave_date = leave_date;
		this.leave_sts = leave_sts;
	}
	
	
}
