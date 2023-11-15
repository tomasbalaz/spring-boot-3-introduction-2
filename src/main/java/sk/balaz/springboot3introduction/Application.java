package sk.balaz.springboot3introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping()
	public GreetResponse greet() {
		GreetResponse response = new GreetResponse(
				"Hello",
				List.of("Java", "Golang", "Python"),
				new Person("Tomas ", 28, 30_000)
		);
		return response;
	}

	record Person(
			String name,
			int age,
			double savings) {}

	record GreetResponse(
			String greet,
			List<String> favouriteProgrammingLanguages,
			Person person) {}

}
