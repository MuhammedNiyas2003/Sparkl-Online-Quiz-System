import React from 'react';
import { Link } from 'react-router-dom';

function QuizItem({ quiz }) {
  return (
    <div>
      <h3>
        <Link to={`/quiz/${quiz.id}`}>{quiz.title}</Link>
      </h3>
    </div>
  );
}

export default QuizItem;
