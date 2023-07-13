package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.QuestionService;

@RestController
@RequestMapping(path = "question")
public class QuestionController {

	@Autowired //injects the object dependency, no need to create object of service.
	QuestionService questionService;
	
	@GetMapping(path = "allQuestions")
	public String getAllQuestions() {
		return questionService.getAllQuestions();
	}
}