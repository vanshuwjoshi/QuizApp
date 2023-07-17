package com.quizProject.quizzapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizProject.quizzapp.model.Question;
import com.quizProject.quizzapp.repository.QuestionDAO;


@Service
public class QuestionService {

	@Autowired
	QuestionDAO questionDAO;
	
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionDAO.findAll();
	}

}

