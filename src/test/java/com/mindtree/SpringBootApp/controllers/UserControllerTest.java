package com.mindtree.SpringBootApp.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import com.mindtree.SpringBootApp.models.User;
import com.mindtree.SpringBootApp.repositories.UserRepository;


@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace =Replace.NONE)
@DataJpaTest
public class UserControllerTest{
//	@Autowired
//	private TestEntityManager entityManager;
		
	@Autowired
	private UserRepository userRepository;


	@Test
	public void testTemp() {
		
	}
	
	@Test
	public void createTest() throws Exception{
		User user = userRepository.save(new User("Jacek", "Jack.2018@xyz.com","9823456789","Sydney"));
 
		 Assert.assertEquals("Jacek", user.getName());
		 Assert.assertEquals("Jack.2018@xyz.com", user.getEmailId());
		 Assert.assertEquals("9823456789", user.getPhone());
		 Assert.assertEquals("Sydney", user.getAddress());
		 
	}
	

}