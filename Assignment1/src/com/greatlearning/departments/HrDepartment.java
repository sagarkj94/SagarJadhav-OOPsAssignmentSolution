package com.greatlearning.departments;

public class HrDepartment extends SuperDepartment{

	private String departmentName="Hr Department";
	private String todaysWork="Fill today’s timesheet and mark your attendance";
	private String workDeadline="Complete by EOD";
	private String activity="team Lunch";
	
	public String departmentName() {
		return departmentName;		
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String doActivity() {
		return activity;
	}
}
