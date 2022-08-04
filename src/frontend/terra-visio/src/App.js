import logo from './Resources/logo.svg';
import './Resources/App.css';
import {ContinentList} from "./infopages/ContinentList";
import React from "react";
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import {LocationList} from "./infopages/LocationList";
import {Test} from "./Test";

import SinglePostPage from "./forum/PostPage";
import InfoPage from "./infopages/InfoPage";
import Topics from "./forum/ForumTopics";
import Posts from "./forum/TopicPosts";

function App() {
  return (
    <div className="App">
      <header className="App-header">
          <Routes>
              <Route path="/" element={<ContinentList/>}/>
              <Route path="/:name/locationlist" element={<LocationList/>}/>
              <Route path="/location/:name" element={<InfoPage/>}/>
              <Route path="/forum" element={<Topics/>}/>
              <Route path="/forum/topics/:id/:title" element={<Posts/>}/>
              <Route path="/forum/topics/:title/:id/:title" element={<SinglePostPage/>}/>
          </Routes>
      </header>
    </div>
  );
}

export default App;
