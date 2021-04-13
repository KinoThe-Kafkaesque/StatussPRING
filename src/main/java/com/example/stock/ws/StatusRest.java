package com.example.stock.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Status;
import com.example.stock.service.StatusService;

@RestController
@RequestMapping("projet-mini-facebook/status")
@CrossOrigin("http://localhost:4200")
public class StatusRest {
	
	@Autowired
	private StatusService statusService;
	
	@GetMapping("/code/{code}")
	public Status findByCode(@PathVariable String code) {
		return statusService.findByCode(code);
	}
	
//	@GetMapping("/user/login/{login}")
//	public List<Status> findByUserLogin(@PathVariable String login) {
//		return statusService.findByUserLogin(login);
//	}
//
//	@DeleteMapping("user/login/{login}")
//	public int deleteByUserLogin(@PathVariable String login) {
//		return statusService.deleteByUserLogin(login);
//	}
	
	@GetMapping("/liked")
	public List<Status> findByLike() {
		return statusService.findByLike();
	}

	@PostMapping("/")
	public int save(@RequestBody Status status) {
		return statusService.save(status);
	}
	
	@GetMapping("/")
	public List<Status> findAll() {
		return statusService.findAll();
	}
	@DeleteMapping("/code/{code}")
	public int deleteByCode(@PathVariable String code) {
	
	return statusService.deleteByCode(code);
	}
	
}	
	
	
