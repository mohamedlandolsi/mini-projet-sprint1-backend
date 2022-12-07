package com.mohamed.smartphones;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mohamed.smartphones.entities.Smartphone;
import com.mohamed.smartphones.repos.SmartphoneRepository;

@SpringBootTest
class Smartphones3ApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	private SmartphoneRepository smartphoneRepository;
	
//	@Test
//	public void testCreateSmartphone() {
//	Smartphone phone = new Smartphone(3, "Samsung S21", 2000.500);
//	smartphoneRepository.save(phone);
//	}
	
//	@Test
//	public void testDeleteSmartphone()
//	{
//	smartphoneRepository.deleteById(1);;
//	}


}
