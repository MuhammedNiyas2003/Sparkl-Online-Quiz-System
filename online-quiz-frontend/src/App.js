import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import QuizList from './components/QuizList';
import QuizPage from './pages/QuizPage'; // New component for displaying quiz questions

function App() {
  return (
    <Router>
      <div className="App">
        <h1>Online Quiz System</h1>
        <Routes>
          <Route path="/" element={<QuizList />} />
          <Route path="/quiz/:id" element={<QuizPage />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
