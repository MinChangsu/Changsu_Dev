import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Carrot from './Carrot'


const root = ReactDOM.createRoot(document.getElementById('starter'));
root.render(
  <React.StrictMode>
    <App />
    <Carrot/>
  </React.StrictMode>
);


