package sample.cafekiosk.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * sellingTypes 에 "HOLD" 입력 시 기대하는 쿼리문
     * select *
     * from product
     * where selling_type in ('SELLING');
     */
    List<Product> findAllBySellingTypeIn(List<ProductSellingType> sellingTypes);
}
