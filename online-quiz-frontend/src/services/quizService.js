import axios from "axios";

const API_BASE_URL = "http://localhost:8080/api"; // Replace with your backend URL

export const fetchQuizzes = () => axios.get(`${API_BASE_URL}/quizzes`);

export const fetchQuizQuestions = (quizId) => axios.get(`${API_BASE_URL}/quizzes/${quizId}/questions`);

export const submitQuestion = (question) => axios.post(`${API_BASE_URL}/questions`, question);
