package ua.edu.ucu.apps.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

import java.util.List;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
public class FlowerStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerStoreApplication.class, args);
	}

	@GetMapping("/flowers")
	public List<Flower> getFlowers(){
		return List.of(new Flower(FlowerColor.BLUE, 50, 100), new Flower(FlowerColor.BLUE, 40, 80), new Flower(FlowerColor.RED, 60, 120));
	}

	@GetMapping("/test")
	public String customTest(){
		return "That's test text.";
	}
}
