package com.ixtiyor.product.repository;

import com.ixtiyor.product.entity.ProductDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetailEntity, Long> {
}
