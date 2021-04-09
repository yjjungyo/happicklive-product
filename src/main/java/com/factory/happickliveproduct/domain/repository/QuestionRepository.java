package com.factory.happickliveproduct.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factory.happickliveproduct.domain.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
