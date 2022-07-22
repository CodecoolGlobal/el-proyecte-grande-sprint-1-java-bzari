import React, {useEffect} from 'react';
import {ButtonCreator} from "./Button";
import {Link} from "react-router-dom";
import useCancallableFetch from './useCancallableFetch.jsx';

export function ContinentList(){
    //useState & useEffect
    const continentData = useCancallableFetch({url:"/api/allContinents", method: "GET", initialState: []});

    return (
        <><div className={"button-collection"} id={"btn-box"}>
              {continentData.length===0?"No data yet.":continentData.map(data => {
                  return <Link key={} to={`/${data.name}/locationlist`}><ButtonCreator context={data.name} buttonId={data.id}/></Link>
              }
                                                                        )}
          </div></>
    )
}
