package com.question.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import com.question.service.QuestionService;
@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	QuestionRepository questionRepository;

	@Override
	public Question add(Question question) {
		// TODO Auto-generated method stub
		
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getById(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question"+id+" Not found"));
	}

	@Override
	public List<Question> findByQuizId(Long quizid) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(quizid);
	}

}
