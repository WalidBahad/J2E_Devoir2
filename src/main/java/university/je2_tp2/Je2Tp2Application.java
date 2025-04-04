package university.je2_tp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import university.je2_tp2.entities.Product;
import university.je2_tp2.repository.ProductRepository;

@SpringBootApplication
public class Je2Tp2Application implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Je2Tp2Application.class, args);
    }

    @Override
    public void run(String... args) {
        productRepository.save(new Product(1, "smart phone", 3200, 20));
        productRepository.save(new Product(2, "computer", 4000, 4));
        System.out.println("Products inserted into H2 database.");
    }
}
