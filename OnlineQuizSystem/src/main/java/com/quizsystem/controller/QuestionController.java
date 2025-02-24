package com.quizsystem.controller;

import com.quizsystem.model.Question;
import com.quizsystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // Add a new question to a quiz
    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
        Question newQuestion = questionService.addQuestion(question);
        return ResponseEntity.ok(newQuestion);
    }

    // Get all questions for a specific quiz
    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<List<Question>> getQuestionsByQuiz(@PathVariable Long quizId) {
        List<Question> questions = questionService.getQuestionsByQuiz(quizId);
        return ResponseEntity.ok(questions);
    }
}
