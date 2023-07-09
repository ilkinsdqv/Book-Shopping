package bookShopping.bookShoppingProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import bookShopping.bookShoppingProject.file.StorageProperties;
import bookShopping.bookShoppingProject.file.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class BookShoppingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookShoppingProjectApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.init();
		};
	}
}
