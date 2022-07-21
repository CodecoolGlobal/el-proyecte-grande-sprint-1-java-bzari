import React from 'react';

export function ButtonCreator(props){
    return(
        <>
        <button id={props.buttonId} className={props.className} onClick={props.onClick}>
            {props.context}
        </button>
        </>
    )
}