import logo from './Resources/logo.svg';
import './Resources/App.css';
import {ContinentList} from "./Fetch.js";
import React from "react";
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import {LocationList} from "./LocationList";
import {Test} from "./Test";
import InfoPage from "./InfoPage";

function App() {
  return (
    <div className="App">
      <header className="App-header">
          <Routes>
              <Route path="/" element={<ContinentList/>}/>
              <Route path="/continent/:name" element={<LocationList/>}/>
              <Route path="/location/:name" element={<InfoPage/>}/>
          </Routes>
      </header>
    </div>
  );
}

export default App;
