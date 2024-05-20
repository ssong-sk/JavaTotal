package boot.thymeleaf.jap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"mycar.*"}) //패키지 위치
@EntityScan("mycar.data") //dto 위치
@EnableJpaRepositories("mycar.repository") //dao 위치
public class BootThymeleafJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootThymeleafJpaApplication.class, args);
	}

}
