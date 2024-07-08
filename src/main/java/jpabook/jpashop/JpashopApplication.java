package jpabook.jpashop;


import com.fasterxml.jackson.datatype.hibernate5.jakarta.Hibernate5JakartaModule;
import jpabook.jpashop.domain.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}

	@Bean
	Hibernate5JakartaModule hibernate5JakartaModule() {
		Hibernate5JakartaModule module = new Hibernate5JakartaModule();
		return module;
		//얘 기본설정 자체가 프록시는 데이터를 안뿌림
	}
}
