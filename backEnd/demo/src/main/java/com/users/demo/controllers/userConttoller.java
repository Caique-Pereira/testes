package com.users.demo.controllers;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.users.demo.dto.UserDTO;
import com.users.demo.services.UserService;


@RestController
public class userConttoller {

	
	@Autowired
	private UserService service ;
	
	@GetMapping("/")
	public ResponseEntity<ArrayList<UserDTO>> listUsers() {
		ArrayList<UserDTO> list =  service.listAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<UserDTO> insert(@RequestBody UserDTO dto){
		UserDTO user = service.insert(dto);
		return ResponseEntity.ok().body(user);
	}
	
	@PutMapping("/")
	public ResponseEntity<?> update(@RequestBody UserDTO dto){
		return service.update(dto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.ok().build();  
	}
	
	
	
	
}
