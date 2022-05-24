package van.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController
public class VanRomelProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanRomelProductApplication.class, args);
	}
	@GetMapping()
	public String olaMundo(){
		return "<h1>Parking Spot</h1> <h3>obrigado, mano</h3>";}

}
