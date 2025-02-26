import React, { useEffect, useState } from 'react';
import QuizItem from './QuizItem';
import axios from 'axios';

function QuizList() {
  const [quizzes, setQuizzes] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/quizzes') // Adjust the endpoint if needed
      .then((response) => {
        setQuizzes(response.data);
      })
      .catch((error) => {
        console.error('Error fetching quizzes:', error);
      });
  }, []);

  return (
    <div>
      <h2>Available Quizzes</h2>
      {quizzes.map((quiz) => (
        <QuizItem key={quiz.id} quiz={quiz} />
      ))}
    </div>
  );
}

export default QuizList;
