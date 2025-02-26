import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';

function QuizPage() {
  const { id } = useParams();
  const [questions, setQuestions] = useState([]);

  useEffect(() => {
    axios.get(`http://localhost:8080/api/quizzes/${id}/questions`)
      .then((response) => {
        setQuestions(response.data);
      })
      .catch((error) => {
        console.error('Error fetching questions:', error);
      });
  }, [id]);

  return (
    <div>
      <h2>Quiz Questions</h2>
      {questions.map((question, index) => (
        <div key={question.id}>
          <h4>{index + 1}. {question.text}</h4>
          <ul>
            {question.options.map((option, idx) => (
              <li key={idx}>{option}</li>
            ))}
          </ul>
        </div>
      ))}
    </div>
  );
}

export default QuizPage;
