package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {

	@Id
//	@GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    private Long salary;

    public Employee() {
    	System.out.println("Employee object created...default constructor");
    }
    
    public Employee(Integer id, String name, Integer age, Long salary) {
    	System.out.println("Employee object created...parameterized constructor");
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
		this.id = id;
	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
		this.name = name;
	}
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
		this.age = age;
	}
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
		this.salary = salary;
	}
    
    @Override
    public String toString() {
        return "[id=" + this.id.intValue() + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
    }

}