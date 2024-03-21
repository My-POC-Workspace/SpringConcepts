package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int projectId;
	private String projectName;
	
	@ManyToMany
	@JoinTable(name = "COMMON",
	joinColumns = {@JoinColumn(name="first")},
	inverseJoinColumns = {@JoinColumn(name="second")})
	private List<Employee> employees;

	public Project() {
		super();
		System.out.println("Default Constructor of Project  :");
	}

	public Project(int projectId, String projectName, List<Employee> employees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employees = employees;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", employees=" + employees + "]";
	}
	
	
}
