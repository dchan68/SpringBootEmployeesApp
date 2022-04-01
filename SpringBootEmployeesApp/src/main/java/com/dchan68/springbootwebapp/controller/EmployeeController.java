package com.dchan68.springbootwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dchan68.springbootwebapp.entity.Employee;
import com.dchan68.springbootwebapp.repository.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping({"/showEmployees", "/", "/list"})
	public ModelAndView showEmployee() {
			ModelAndView mav = new ModelAndView("list-employees");
			List<Employee> list = eRepo.findAll();
			mav.addObject("employees", list);
			return mav;
	}
}
