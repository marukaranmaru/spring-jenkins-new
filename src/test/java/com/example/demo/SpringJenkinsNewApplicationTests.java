package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsNewApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsNewApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true , true);
	}

}
