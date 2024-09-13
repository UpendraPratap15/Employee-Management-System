package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService 
{
	void addRecord(Employee employee);
	List<Employee> getList();
	Employee getRecord(int eid);
	void deleteRecord(int eid);
	void updateRecord(Employee employee);
}
