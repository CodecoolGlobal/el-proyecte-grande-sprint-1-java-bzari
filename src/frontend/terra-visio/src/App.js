import logo from './logo.svg';
import './App.css';
import {ContinentList} from "./ContinentList";
import React from "react";
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import {LocationList} from "./LocationList";
import {Test} from "./Test";


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
          <Routes>
              <Route path="/" element={<ContinentList/>}/>
              <Route path="/:name/locationlist" element={<LocationList/>}/>
              <Route path="/location/:name" element={<Test/>}/>
          </Routes>
      </header>
    </div>
  );
}

export default App;
