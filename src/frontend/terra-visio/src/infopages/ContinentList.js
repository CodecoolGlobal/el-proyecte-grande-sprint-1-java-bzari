import React, {useContext, useEffect} from 'react';
import { Link } from "react-router-dom";
import {CoordinateContext} from "../App";

export function ContinentList(){
    const [continentData, setContinentData] = React.useState([])
    useEffect( () => {
        fetch('/api/continent/allContinents',
            {method:"GET",
                headers: {"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setContinentData(data))
    }, [])

    const setCoordinate = useContext(CoordinateContext)
    return (
        <><div className={"button-collection"} id={"btn-box"}>
            {continentData.length===0?"No data yet.":continentData.map(data => {
                return <Link to={`/continent/${data.name}`}>
                    <button onClick={()=>{setCoordinate([15, 0]); eventListener(data.name)}}>{data.name}</button>
                </Link>
                }
            )}
        </div></>
    )
}
function eventListener(continentName){
    const countriesInContinent = document.getElementsByClassName(continentName.toLowerCase());
    for (let country of countriesInContinent) {
        country.style.fill = "#194952"
    }
}