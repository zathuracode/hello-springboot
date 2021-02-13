package co.com.coomeva.devops.hello.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@SpringBootTest
class HelloControllerTest {
	
	@Autowired
	MockMvc mockMvc;

	@Test
	void testIndex()throws Exception {
		
		//Arrange
		String expect="Hello from Spring Boot and Azure Cloud";
		
		//Act
		mockMvc.perform(MockMvcRequestBuilders.get("/")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo(expect)));
	}
	
	@Test
	void testIndexParam()throws Exception {
		
		//Arrange
		String name="Juan";
		String expect="Hello "+name+" from Spring Boot and Azure Cloud";
		
		//Act
		mockMvc.perform(MockMvcRequestBuilders.get("/"+name)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo(expect)));
	}

}
