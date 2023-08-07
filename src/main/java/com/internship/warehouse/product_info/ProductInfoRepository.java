package com.internship.warehouse.product_info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Long> {

    ProductInfo findById(long id);
}
