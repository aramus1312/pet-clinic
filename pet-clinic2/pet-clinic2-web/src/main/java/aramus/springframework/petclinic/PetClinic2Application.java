package aramus.springframework.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller", "services", "bootstrap"})
public class PetClinic2Application {

	public static void main(String[] args) {
		SpringApplication.run(PetClinic2Application.class, args);
	}

}
