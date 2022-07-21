import logo from './logo.svg';
import './App.css';
import {ContinentList} from "./ContinentList";
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
              <Route path="/:name/locationlist" element={<LocationList/>}/>
              <Route path="/location/:name" element={<InfoPage/>}/>
          </Routes>
      </header>
    </div>
  );
}

export default App;
