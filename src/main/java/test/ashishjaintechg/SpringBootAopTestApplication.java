package test.ashishjaintechg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/greetingsApi")
@EnableAspectJAutoProxy
public class SpringBootAopTestApplication {

	@GetMapping("/message")
	public String getMessage(@RequestParam("name") String name) {
		return "Hello "+name;
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopTestApplication.class, args);
	}

}
