import logo from './Resources/logo.svg';
import './Resources/App.css';
import {ContinentList} from "./infopages/ContinentList";
import React, {createContext, useEffect, useState} from "react";
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import {LocationList} from "./infopages/LocationList";

import SinglePostPage from "./forum/PostPage";
import InfoPage from "./infopages/InfoPage";
import Topics from "./forum/ForumTopics";
import Posts from "./forum/TopicPosts";

import Registration from "./registerAndLogin/RegisterForm";
import LoginForm from "./registerAndLogin/LoginForm";
import {Map} from "./worldmap/Map";

export const CoordinateContext = createContext();

function App() {
  return (
    <div className="App">
            <Routes>
                <Route path="/" element={<Map/>}/>
                <Route path="/" element={<ContinentList/>}/>
                <Route path="/continent/:name" element={<LocationList/>}/>
                <Route path="/location/:name" element={<InfoPage/>}/>
                <Route path="/forum" element={<Topics/>}/>
                <Route path="/forum/topics/:id/:title" element={<Posts/>}/>
                <Route path="/forum/topics/posts/:id/:title" element={<SinglePostPage/>}/>
                <Route path="/register" element={<Registration/>}/>
                <Route path="/login" element={<LoginForm/>}/>
            </Routes>
    </div>
  );
}

export default App;
