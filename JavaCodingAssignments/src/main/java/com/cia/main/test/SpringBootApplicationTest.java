package com.cia.main.test;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.cia.main.controller.GitHubController;

@RunWith(SpringRunner.class)
@WebMvcTest(value=GitHubController.class)
public class SpringBootApplicationTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	RestTemplate restTemplate;
	
	@Test
	public void testsavdmethod() throws Exception {
	
		
	}
	
	

}
