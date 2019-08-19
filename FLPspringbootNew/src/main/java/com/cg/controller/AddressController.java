package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Address;
import com.cg.bean.User1;
import com.cg.service.AddressService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Address")
public class AddressController {

	@Autowired 
	private AddressService service;
	
	@PostMapping(value="/addAddress",consumes={"application/json"})	
	public String add(@RequestBody Address address) {
		System.out.println(address);
//		System.out.println(address+" for EmailId= "+emailid);
//		service.addAddress(address, emailid) ;
		return "Hello";
	}
	
	@GetMapping(produces= {"application/json"})
	public List<User1> getall() {
		return service.getall();
	}
	
}
