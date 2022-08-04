import React, {useEffect} from 'react';
import {ButtonCreator} from "../Button";
import {Link} from "react-router-dom";

export function ContinentList(){
    //useState & useEffect
    const [continentData, setContinentData] = React.useState([])
    useEffect( () => {
        fetch('/api/allContinents',
            {method:"GET",
            headers: {"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setContinentData(data))
    }, [])

    return (
        <><div className={"button-collection"} id={"btn-box"}>
            {continentData.length===0?"No data yet.":continentData.map(data => {
                    return <Link to={`/${data.name}/locationlist`}><ButtonCreator context={data.name} buttonId={data.id}/></Link>
                }
            )}
        </div></>
    )
}