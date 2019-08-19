package com.cg.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.cg.bean.User1;
@Component
public interface AddressService {

	public String addAddress(String address, String emailId); 
	public List<User1> getall();
}
