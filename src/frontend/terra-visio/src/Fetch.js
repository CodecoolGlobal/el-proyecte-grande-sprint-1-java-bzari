import React, {useEffect} from 'react';
import axios from 'axios';

export function ContinentList(){
    const [continentData, setContinentData] = React.useState([])
    useEffect( () => {
        fetch('/api/allContinents',
            {method:"GET",
            headers: {"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setContinentData(data))
    }, [])

    return (
        <>{continentData.length===0?"No data yet.":continentData.map(data => {
            const clickHandler = event => {
            }
                return <button key={data.id}>{data.name}</button>
            }
        )}</>
    )
}