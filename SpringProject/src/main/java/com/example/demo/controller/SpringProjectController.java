package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/SpringProject")
public class SpringProjectController {
	
	@GetMapping
	public ResponseEntity<HashMap<String, Object>> hello(){
		HttpStatus status =  HttpStatus.OK;
		HashMap<String, Object> response = new HashMap<>();
		ArrayList<String> data = new ArrayList<String>();
		
		data.add("array value");
		response.put("staus", "hellow");
		response.put("array", data);
		return new ResponseEntity<>(response, status);
//		return ResponseEntity.ok().body(response);
	}

}
