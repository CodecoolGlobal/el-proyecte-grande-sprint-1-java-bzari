import React, {useContext, useState} from 'react';
import {CoordinateContext} from "./App.js";

function eventListener(){
    const europe = document.getElementsByClassName("europe");
    for (let i = 0; i < europe.length; i++) {
        // console.log(europe[i])
        europe[i].style.fill = "red"
    }
}

export function TestButton(){
    const setCoordinate = useContext(CoordinateContext)

    return(
        <>
        <div className={"test-button"}>
            {/*<CoordinateContext.Provider value={[30, 0]}>*/}
                <button onClick={()=>{setCoordinate([0, 0]); eventListener()}}>Button</button>
            {/*<button onClick={eventListener}>Button</button>*/}

            {/*</CoordinateContext.Provider>*/}
        </div>
        </>
    )
}