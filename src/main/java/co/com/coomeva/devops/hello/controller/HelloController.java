package co.com.coomeva.devops.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@GetMapping
	public String index() {
		return "Hola desde Spring Boot Y Azure Cloud";
	}
	
	@GetMapping("/{name}")
	public String index(@PathVariable("name") String name) {
		return "Hola "+name+" desde Spring Boot Y Azure Devops";
	}

}
