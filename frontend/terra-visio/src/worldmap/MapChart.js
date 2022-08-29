import React, {memo, useEffect, useState} from "react";
import {useNavigate} from "react-router-dom";
import {
    ZoomableGroup,
    ComposableMap,
    Geographies,
    Geography,
    Marker
} from "react-simple-maps";
import {toggleVisibilityOnRollback} from "./rollback";

const MapChart = ( props ) => {
    const[continentData, setContinentData] = useState([]);
    useEffect(()=>{
        fetch('/api/continent/allContinents',
            {method:"GET",
                headers: {"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setContinentData(data))
    }, [])

    const[locationData, setLocationData] = useState([]);
    useEffect(() => {
        fetch(`/api/locations`,
            {method:"GET",
                headers:{"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setLocationData(data))
    }, [])
    console.log(locationData)

    return (
        <div style={{display: "flex", justifyContent: "center"}}>
            <div data-tip="" style={{height: "100%", width: "70%", border:"2px solid black"}}>
                <ComposableMap>
                    <ZoomableGroup center={props.center} zoom={1}>
                        <Geographies geography="/features.json">
                            {({ geographies }) =>
                                geographies.map((geo) => (
                                    <Geography
                                        class={geo.properties.continent !=null ? "country " + geo.properties.continent : "country undefined-continent"}
                                        id={geo.properties.name.toLowerCase()}
                                        key={geo.rsmKey}
                                        geography={geo}
                                        onMouseEnter={() => {
                                            props.setTooltipContent(`${geo.properties.name}`);
                                        }}
                                        onMouseLeave={() => {
                                            props.setTooltipContent("");
                                        }}
                                        style={{
                                            default: {
                                                // fill: "#D6D6DA",
                                                outline: "none"
                                            },
                                            hover: {
                                                // fill: "#F53",
                                                outline: "none"
                                            },
                                            pressed: {
                                                // fill: "#E42",
                                                outline: "none"
                                            }
                                        }}
                                    />
                                ))
                            }
                        </Geographies>
                        {continentData.length===0?"":continentData.map(data => {
                                let altitude = data.altitude
                                let longitude = data.longitude
                                return(
                                    <Marker coordinates={[altitude, longitude]}>
                                        <g className={"marker continent-marker"}
                                           fill="#99CD7D"
                                           stroke="#fff"
                                           onClick={() => {
                                               toggleVisibilityOnContinentMarker();
                                               setHighlight(data.name);
                                               displayLocations(data.id);
                                               toggleVisibilityOnRollback()
                                           }}
                                           strokeWidth="2"
                                           strokeLinecap="round"
                                           strokeLinejoin="round"
                                           transform="translate(-12, -24)"
                                        >
                                            <circle cx="12" cy="10" r="3"/>
                                            <path d="M12 21.7C17.3 17 20 13 20 10a8 8 0 1 0-16 0c0 3 2.7 6.9 8 11.7z" />
                                        </g>
                                    </Marker>
                                )
                            }
                        )}
                        {locationData.length===0?"":locationData.map(data => {
                            let altitude = data.altitude
                            let longitude = data.longitude
                            return(
                                <Marker coordinates={[altitude, longitude]}>
                                    <g className={"marker location-marker continent-"+data.continentId}
                                       fill="#99CD7D"
                                       stroke="#fff"
                                       display="none"
                                       onClick={() => {
                                           // toggleVisibilityOnContinentMarker();
                                           // setHighlight(data.name);
                                           NavigateToInfoPage(data.name);
                                       }}
                                       strokeWidth="2"
                                       strokeLinecap="round"
                                       strokeLinejoin="round"
                                       transform="translate(-12, -24)"
                                    >
                                        <circle cx="12" cy="10" r="3"/>
                                        <path d="M12 21.7C17.3 17 20 13 20 10a8 8 0 1 0-16 0c0 3 2.7 6.9 8 11.7z" />
                                    </g>
                                </Marker>
                            )
                        })}

                        {/*GREAT-CORAL-REEF*/}
                        {/*<Marker coordinates={[510, -35]}>*/}

                        {/*    <g className={"marker continent-marker"}*/}
                        {/*       fill="none"*/}
                        {/*       stroke="#7dc1cd"*/}
                        {/*       strokeWidth="2"*/}
                        {/*       strokeLinecap="round"*/}
                        {/*       strokeLinejoin="round"*/}
                        {/*       transform="translate(-12, -24)"*/}
                        {/*    >*/}
                        {/*        <circle cx="12" cy="10" r="3"/>*/}
                        {/*        <path d="M12 21.7C17.3 17 20 13 20 10a8 8 0 1 0-16 0c0 3 2.7 6.9 8 11.7z" />*/}
                        {/*    </g>*/}
                        {/*</Marker>*/}
                    </ZoomableGroup>
                </ComposableMap>
            </div>
        </div>

    );
};

export function toggleVisibilityOnContinentMarker(){
    const continentMarkers = document.getElementsByClassName("continent-marker");
    for (let marker of continentMarkers) {
        marker.style.display==="none"?marker.style.display="block":marker.style.display="none"
    }
}

function setHighlight(continentName){
    const countriesInContinent = document.getElementsByClassName(continentName.toLowerCase());
    for (let country of countriesInContinent) {
        country.style.fill = "green"
    }
}


function displayLocations(id) {
    const locations = document.getElementsByClassName("continent-"+id);
    for (let location of locations) {
        location.style.display = "block"
    }
}

function NavigateToInfoPage(name) {
    const navigate = useNavigate();
    navigate("/")
}

export default memo(MapChart);
