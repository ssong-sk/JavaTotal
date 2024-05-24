package boot.mvc.market;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"data.*"})
@MapperScan({"boot.mapper"})
public class BootMybatisJstlApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMybatisJstlApplication.class, args);
	}

}
