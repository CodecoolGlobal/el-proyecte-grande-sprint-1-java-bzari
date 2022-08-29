import {createContext, useState} from "react";
import {CoordinateContext} from "../App";
import MapChart from "./MapChart";
import ReactTooltip from "react-tooltip";
import {Rollback} from "./rollback";

export function Map(){
    const [content, setContent] = useState("");
    const [coordinate, setCoordinate] = useState([15, 0]);
    return (
        <><div className={"button-collection"} id={"btn-box"}>
            <CoordinateContext.Provider value={setCoordinate}>
                <MapChart setTooltipContent={setContent} center={coordinate}/>
                <ReactTooltip>{content}</ReactTooltip>
                <Rollback/>
            </CoordinateContext.Provider>
        </div></>
    )
}