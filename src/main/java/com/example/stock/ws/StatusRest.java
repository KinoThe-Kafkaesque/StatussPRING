package com.example.stock.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Status;
import com.example.stock.service.StatusService;
import com.example.stock.vo.StatusVo;

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
//	
//	@GetMapping("/likes/likes")
//	public List<Status> findByLike(@PathVariable Boolean likes) {
//		return statusService.findByLike();
//	}
	@GetMapping("/likes/likes")
	public Iterable<Status> findByLikes( Boolean likes){
		return statusService.findByLikes(likes);
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
//	@PutMapping("/")
//	public int update(@RequestBody Status status) {
//		return statusService.update(status);
//	}
	
	@PutMapping("/code/{code}")
	public	int update(@PathVariable(value = "code") String code,
	   @RequestBody StatusVo statusDetails)  {
	 Status status = statusService.findByCode(code);

	 status.setContenu(statusDetails.getContenu());
	 status.setLikes(statusDetails.isLikes());
	 return statusService.update(status);
	
	}
	
}	
	
	
