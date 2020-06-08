package com.sboot.crud.springbootcrudapi.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYE")
public class EmployeeEntity {
 
    @Id
    @GeneratedValue
    @Column(name="EMP_ID")
    private Long id;
     
    @Column(name="EMP_NAME")
    private String name;
     
    @Column(name="EMP_SALARY")
    private String salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
     
    
}
