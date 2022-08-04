import React from 'react';
import './Resources/index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter} from "react-router-dom";
import Header from "./header/Navbar";
import 'bootstrap/dist/css/bootstrap.min.css';
import ReactDOM from 'react-dom';
import './Resources/index.css';



const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
      <Header />
                  <video
                      autoPlay
                      loop
                      muted
                      poster="https://assets.codepen.io/6093409/river.jpg"
                  >
                      <source
                          src="https://assets.codepen.io/6093409/river.mp4"
                          type="video/mp4"
                      />
                  </video>
                  <BrowserRouter>
                      <App />
                  </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
