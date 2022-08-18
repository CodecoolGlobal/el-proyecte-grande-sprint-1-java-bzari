import React, {memo} from "react";
import {
    ZoomableGroup,
    ComposableMap,
    Geographies,
    Geography,
    Marker
} from "react-simple-maps";

const MapChart = ( props ) => {
    return (
        <div data-tip="" style={{width: "80%", border:"2px solid black", display:"flex", justifyContent:"center"}}>
            <ComposableMap>
                <ZoomableGroup center={props.center} zoom={1}>
                    <Geographies geography="/features.json">
                        {({ geographies }) =>
                            geographies.map((geo) => (
                                <Geography
                                    class={geo.properties.continent !=null ? "country " + geo.properties.continent : "country undefined-continent"}
                                    id={geo.properties.name.toLowerCase()}
                                    key={geo.rsmKey}
                                    geography={geo}
                                    onMouseEnter={() => {
                                        props.setTooltipContent(`${geo.properties.name}`);
                                    }}
                                    onMouseLeave={() => {
                                        props.setTooltipContent("");
                                    }}
                                    style={{
                                        default: {
                                            // fill: "#D6D6DA",
                                            outline: "none"
                                        },
                                        hover: {
                                            // fill: "#F53",
                                            outline: "none"
                                        },
                                        pressed: {
                                            fill: "#E42",
                                            outline: "none"
                                        }
                                    }}
                                />
                            ))
                        }
                    </Geographies>
                </ZoomableGroup>
            </ComposableMap>
        </div>
    );
};

export default memo(MapChart);
