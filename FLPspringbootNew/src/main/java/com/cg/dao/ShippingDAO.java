package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.bean.User1;
@Component
@Repository
public interface ShippingDAO extends JpaRepository<User1,Integer> {
	@Query("select u From User1 u  where u.emailid=?1")
	public User1 getuser(String email);
	
	
}
