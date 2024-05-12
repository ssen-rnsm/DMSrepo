package io.javabrains.basicspringbootproject.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/checkHealth")
	public String checkHealth() {
		
		return "health is good";
	}
}
