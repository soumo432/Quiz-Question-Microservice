package com.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entities.Question;

public interface QuestionService {


	Question add(Question question);
	
	List<Question> get();
	
	Question getById(Long id);
	
	List<Question> findByQuizId(Long id);
}
