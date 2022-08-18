import logo from './Resources/logo.svg';
import './Resources/App.css';
import {ContinentList} from "./infopages/ContinentList";
import React, {createContext, useEffect, useState} from "react";
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import {LocationList} from "./infopages/LocationList";
import {Test} from "./Test";

import SinglePostPage from "./forum/PostPage";
import InfoPage from "./infopages/InfoPage";
import Topics from "./forum/ForumTopics";
import Posts from "./forum/TopicPosts";
import MapChart from "./worldmap/MapChart";

import ReactTooltip from "react-tooltip";
import {TestButton} from "./TestButton";

export const CoordinateContext = createContext();

function App() {
    const [content, setContent] = useState("");

    const [coordinate, setCoordinate] = useState([15, 0]);


  return (
    <div className="App">

        <CoordinateContext.Provider value={setCoordinate}>

            <MapChart setTooltipContent={setContent} center={coordinate}/>
            <ReactTooltip>{content}</ReactTooltip>
            <Routes>
                <Route path="/" element={<ContinentList/>}/>
                <Route path="/continent/:name" element={<LocationList/>}/>
            {/*    <Route path="/location/:name" element={<InfoPage/>}/>*/}
            {/*    <Route path="/forum" element={<Topics/>}/>*/}
            {/*    <Route path="/forum/topics/:id/:title" element={<Posts/>}/>*/}
            {/*    <Route path="/forum/topics/posts/:id/:title" element={<SinglePostPage/>}/>*/}
            </Routes>

        </CoordinateContext.Provider>
    </div>
  );
}

export default App;
