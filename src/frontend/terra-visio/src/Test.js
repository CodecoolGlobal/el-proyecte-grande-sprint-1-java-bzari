import React from 'react';
import {useParams} from "react-router-dom";

export function Test(){
    const { name } = useParams()
    return(
        <>
        <h1>Working {name}</h1>
        </>
    )
}