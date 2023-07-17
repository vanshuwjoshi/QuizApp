package com.quizProject.quizzapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizProject.quizzapp.model.Question;


@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer>{

	
	
}
