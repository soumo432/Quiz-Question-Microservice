package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.add(question);
	}
	
	@GetMapping
	public List<Question> findAll(){
		return questionService.get();
	}
	
	@GetMapping("/{id}")
	public Question findById(@PathVariable ("id")Long id) {
		return questionService.getById(id);
	}
	
	@GetMapping("/quiz/{quizid}")
	public List<Question> findQuestionsByQuizId(@PathVariable("quizid")Long quizId){
		return questionService.findByQuizId(quizId);
	}

}
