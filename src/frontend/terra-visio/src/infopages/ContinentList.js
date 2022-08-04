import React, {useEffect} from 'react';
import {ButtonCreator} from "../Button";
import {Link} from "react-router-dom";
import Card from 'react-bootstrap/Card';
import {ListGroup} from "react-bootstrap";

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
        <div className={"button-collection layout"} id={"btn-box"}>
            <Card>
            <ListGroup>
            {continentData.length===0?"No data yet.":continentData.map(data => {
                return <ListGroup.Item><Link to={`/continent/${data.name}`}>{data.name}</Link></ListGroup.Item>
                }
            )}
            </ListGroup>
            </Card>
        </div>
    )
}