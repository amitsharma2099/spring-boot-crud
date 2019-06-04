package com.example.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test.dao.EmpRepository;
import com.example.test.model.Employee;

@Controller
public class EmpController {

	@Autowired
	EmpRepository empRepo;
	
	//http://localhost:8080
	@RequestMapping("")
	public String homePage() {
		System.out.println("This is home page...");
		return "home";//prefix/suffix are configured in application.properties
	}
	
	/**
	 * After filling the form, when we submit it, the URL will append query params as:
	 * http://localhost:8080/addEmployee?id=123&name=Ashish&age=25&salary=2500
	 * H2 DB Console: http://localhost:8080/h2-console
	 * H2 DB Connection URL: jdbc:h2:mem:testdb
	 * HTML form is submitting the employee detail, which will be mapped to Employee object param of this method. So Employee's default constructor is invoked here
	 */
	@RequestMapping("addEmployee")
	public String addEmployee(Employee employee) {
		System.out.println("Employee:"+ employee);
		empRepo.save(employee); //returns the saved entity i.e. Employee in this case. So employee's default constructor is being invoked here.
//		Employee savedEmployee = empRepo.save(employee);//Use the returned instance for further operations as the save operation might have changed the entity instance completely
		System.out.println("Employee record saved to database.");
		return "home";
	}
	
	@RequestMapping("deleteEmployee")
	public String deleteEmployee(@RequestParam int id) {
//		Employee employee = empRepo.findById(id).orElse(null);
//		System.out.println("Employee:"+ employee);
//		if(employee != null) {
//			empRepo.delete(employee);
//			System.out.println("Employee record deleted from database.");
//		} else {
//			System.out.println("Employee not found in database.");
//		}
		
		//OR
		if(empRepo.existsById(id)) {
			empRepo.deleteById(id);
			System.out.println("Employee record deleted.");
		}else {
			System.out.println("Employee record not found.");
		}
		return "home";
	}
}
