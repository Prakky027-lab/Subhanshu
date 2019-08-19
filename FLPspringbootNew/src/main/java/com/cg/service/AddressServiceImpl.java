package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.User1;
import com.cg.dao.ShippingDAO;
import com.cg.exception.Exception;
@Component
@Service
public class AddressServiceImpl implements AddressService{


	@Autowired 
	private ShippingDAO dao;
	
	public String addAddress(String address, String emailId) {
		System.out.println("Service Implementation "+address+" for EmailId= "+emailId);
		User1 user=dao.getuser(emailId);
		
		if(user==null)
		{
			throw new RuntimeException("user not found");
		}
		else {
			user.setAddress(address);
			dao.save(user);
			return "Address Added";
		}
		
	}
	@Override

	@Transactional(readOnly=true)
	public List<User1> getall() {
		if(dao.findAll().isEmpty()) {
			throw new Exception("No Address Exists");
		}
		return dao.findAll();
	}

	

}
