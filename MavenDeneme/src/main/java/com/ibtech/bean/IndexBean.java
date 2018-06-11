package com.ibtech.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.ibtech.model.Employee;

@ManagedBean(name="indexBean")
@ViewScoped
public class IndexBean {

	private Employee employee= new Employee();
		
	private List<Employee> employeeList= new ArrayList<Employee>();
	
	public void  isciEkle() {
		employeeList.add(employee);
		
	}
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	
	
	
	

}
