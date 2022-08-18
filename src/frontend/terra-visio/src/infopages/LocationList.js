import React, {useEffect} from 'react';
import {ButtonCreator} from "../Button";
import {Link, useParams} from "react-router-dom";
import Button from "react-bootstrap/Button";
// import {Test} from "./Test";

export function LocationList(){
    const { name } = useParams();
    const [locationData, setLocationData] = React.useState([])
    useEffect(() => {
        fetch(`/api/continent/${name}`,
            {method:"GET",
                headers:{"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setLocationData(data))
    }, [])

    return (
        <><div className={"button-collection"}>
            <Link to={'/'}><Button onClick={colorChange}>Rollback</Button></Link>
            {locationData.length===0?"No location-data accessible":locationData.map(data => {
                // return <ButtonCreator context={data.name}/>
                return <Link to={`/location/${data.name}`}><ButtonCreator context={data.name}/></Link>
            })}
        </div></>
    )

    function colorChange(){
        const countriesInContinent = document.getElementsByClassName("country");
        for (let country of countriesInContinent) {
            country.style.fill = ""
        }
    }

}