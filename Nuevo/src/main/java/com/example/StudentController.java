package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "student")
public class StudentController {

	StudentRepository repository;
	
	@Autowired
	public StudentController(StudentRepository repository) {
		this.repository=repository;
		
	}
	
	/*@GetMapping
	public String getStudents(ModelMap model) {
			
			if (repository.getStudents().size() !=0) {
				Student s = repository.getStudents().get(0);
				if (s !=null){
				
				String name = s.getName();
				String city = s.getCity();
				
				model.addAttribute("name", name);
				model.addAttribute("city", city);
				}
			} else {
				model.addAttribute("name", "No student name available");
				model.addAttribute("city", "No student city available");
			}
			return "NewFile";
		}*/
	
	@GetMapping
	public @ResponseBody List<Student> getStudents(ModelMap model) {
		return respository.getStudents(); //view name
	
	
	@PostMapping
	public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
		
		
		repository.addStudents(student);
		return "NewFile";
	}
	}
