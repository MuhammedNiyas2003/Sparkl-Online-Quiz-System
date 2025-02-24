package com.quizsystem.service;

import com.quizsystem.model.Question;
import com.quizsystem.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    // Add a question to the database
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    // Get all questions by quiz ID using the custom query
    public List<Question> getQuestionsByQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
