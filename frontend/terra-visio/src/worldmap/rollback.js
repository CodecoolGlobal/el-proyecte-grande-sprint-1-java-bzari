import {toggleVisibilityOnContinentMarker} from "./MapChart";

export function Rollback(){
    return(
        <button style={{display: "none"}} id={"rollback-btn"} onClick={() => {removeHighlight(); hideLocationMarker(); toggleVisibilityOnContinentMarker(); toggleVisibilityOnRollback()}}>Rollback</button>
    )
}

function removeHighlight(){
    const countriesInContinent = document.getElementsByClassName("country");
    for (let country of countriesInContinent) {
        country.style.fill = ""
    }
}

function hideLocationMarker(){
    const locations = document.getElementsByClassName("location-marker");
    for (let location of locations) {
        location.style.display = "none"
    }
}

export function toggleVisibilityOnRollback(){
    const rollback = document.getElementById("rollback-btn");
    rollback.style.display === "none" ? rollback.style.display = "block" : rollback.style.display = "none";
}
