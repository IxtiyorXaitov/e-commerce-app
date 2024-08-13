package com.ixtiyor.product.repository;

import com.ixtiyor.product.entity.ProductPropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPropertyRepository extends JpaRepository<ProductPropertyEntity, Long> {
}
