package br.com.mlb.rediscache;

import br.com.mlb.rediscache.product.ProductService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@EnableCaching
@SpringBootApplication
public class RedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisCacheApplication.class, args);
	}

	@Bean
	ApplicationRunner runner(ProductService service){
		return args -> {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Id: 1: " + service.getById(1L));
			System.out.println("Id: 2: " + service.getById(2L));
			System.out.println("Id: 1: " + service.getById(1L));
			System.out.println("Id: 1: " + service.getById(1L));
			System.out.println("Id: 1: " + service.getById(1L));
		};
	}
}
