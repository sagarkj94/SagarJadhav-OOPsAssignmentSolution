package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment{

	private String departmentName="Admin Department";
	private String todaysWork="Complete your documents Submission";
	private String workDeadline="Complete by EOD";
	
	public String departmentName() {
		return departmentName;		
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

}
