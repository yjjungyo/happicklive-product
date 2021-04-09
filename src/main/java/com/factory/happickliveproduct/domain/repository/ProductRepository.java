package com.factory.happickliveproduct.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factory.happickliveproduct.domain.entity.Product;


@Repository

public interface ProductRepository extends JpaRepository<Product, Long>{
	//List<Member> findAllMemberByTeamId(Long id);
}

