package com.quizsystem.repository;

import com.quizsystem.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    // Custom query method to find questions by quiz ID
    List<Question> findByQuizId(Long quizId);
}
