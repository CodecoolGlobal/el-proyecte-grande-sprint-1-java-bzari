import React, {useEffect} from 'react';
import {ButtonCreator} from "./Button";
import {Link, useParams} from "react-router-dom";
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
            <Link to={'/'}><ButtonCreator context={"Rollback"}/></Link>
            {locationData.length===0?"No location-dada accessible":locationData.map(data => {
                // return <ButtonCreator context={data.name}/>
                return <Link to={`/location/${data.name}`}><ButtonCreator context={data.name}/></Link>
            })}
        </div></>
    )
}