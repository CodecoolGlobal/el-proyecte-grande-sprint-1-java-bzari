import React, {useEffect} from 'react';
import {ButtonCreator} from "../Button";
import {Link, useParams} from "react-router-dom";
import Card from 'react-bootstrap/Card';
import {ListGroup} from "react-bootstrap";

export function LocationList(props){
    const { name } = useParams();
    console.log(name)
    const [locationData, setLocationData] = React.useState([])
    useEffect(() => {
        fetch(`/api/${name}/locations`,
            {method:"GET",
                headers:{"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setLocationData(data))
    })

    return (
        <div className={"layout"}>
        <Card>
            <ListGroup>
            {locationData.length===0?"No location-data accessible":locationData.map(data => {
                // return <ButtonCreator context={data.name}/>
                return <ListGroup.Item><Link to={`/location/${data.name}`}>{data.name}</Link></ListGroup.Item>
            })}
            </ListGroup>
        </Card>
        </div>
    )
}