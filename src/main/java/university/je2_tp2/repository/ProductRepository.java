package university.je2_tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import university.je2_tp2.entities.Product;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
