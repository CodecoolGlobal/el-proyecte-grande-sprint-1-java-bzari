import React, {useEffect} from 'react';
import axios from 'axios';

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
    
    function removeInnerHtml(id){
        document.getElementById(id).innerHTML = "";
    }
    const clickHandler = event => {
        let str = event.target.dataset.name;
        console.log(str)
    }

    return (
        <><div className={"button-collection"} id={"btn-box"}>
            {continentData.length===0?"No data yet.":continentData.map(data => {
                    return <button key={data.id} data-name={data.name} onClick={clickHandler}>{data.name}</button>
                }
            )}
        </div></>
    )
}