//index.js  가상 dom의 집합소이자 프로젝트 내 진입점(entry point)
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';//가상돔만들기 시작됨


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);


