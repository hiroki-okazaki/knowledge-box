package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KnowledgeBoxApplication {

	@RequestMapping("/")
	String test() {
		return "こんにちは";
	}

	public static void main(String[] args) {
		SpringApplication.run(KnowledgeBoxApplication.class, args);
	}

}
