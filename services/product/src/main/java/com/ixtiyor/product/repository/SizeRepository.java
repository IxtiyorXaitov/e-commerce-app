package com.ixtiyor.product.repository;

import com.ixtiyor.product.entity.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<SizeEntity, Long> {
}
