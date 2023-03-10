package com.example.sample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.Repository.StudentRepo;
import com.example.sample.Table.Student;

@RestController
public class ApiController {
	@Autowired
	private StudentRepo r;
	@PostMapping("/add")
	public Student addDetails(@RequestBody Student s) {
		return r.save(s);
	}
	@GetMapping("/show")
	public List<Student> getDetails(){
		return r.findAll();
	}
	@GetMapping("/show/{id}")
	public Optional<Student> getDetailsById(int id) {
		return r.findById(id);
	}
	@PutMapping("/edit/{id}")
	public Student updateDetails(@RequestBody Student s) {
		return r.saveAndFlush(s);
	}
	@DeleteMapping("/remove/{id}")
	public String deleteDetails(int id) {
		r.deleteById(id);
		return "Details Deleted";
	}
	
}
