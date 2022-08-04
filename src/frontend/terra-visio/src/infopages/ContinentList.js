import React, {useEffect} from 'react';
import { Link } from "react-router-dom";
import {ButtonCreator} from "../Button";

export function ContinentList(){
    const [continentData, setContinentData] = React.useState([])
    useEffect( () => {
        fetch('/api/continent/allContinents',
            {method:"GET",
                headers: {"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setContinentData(data))
    }, [])

    return (
        <><div className={"button-collection"} id={"btn-box"}>
            {continentData.length===0?"No data yet.":continentData.map(data => {
                    return <Link to={`/continent/${data.name}`}><ButtonCreator context={data.name}/></Link>
                }
            )}
        </div></>
    )
}