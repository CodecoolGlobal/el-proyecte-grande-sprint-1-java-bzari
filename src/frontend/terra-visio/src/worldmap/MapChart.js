import React, {memo} from "react";
import {
    ZoomableGroup,
    ComposableMap,
    Geographies,
    Geography,
    Marker
} from "react-simple-maps";

const MapChart = ({ setTooltipContent }) => {
    return (
        <div data-tip="" style={{width: "80%", border:"2px solid black", display:"flex", justifyContent:"center"}}>
            <ComposableMap>
                <ZoomableGroup>
                    <Geographies geography="/features.json">
                        {({ geographies }) =>
                            geographies.map((geo) => (
                                <Geography
                                    key={geo.rsmKey}
                                    geography={geo}
                                    onMouseEnter={() => {
                                        setTooltipContent(`${geo.properties.name}`);
                                    }}
                                    onMouseLeave={() => {
                                        setTooltipContent("");
                                    }}
                                    style={{
                                        default: {
                                            fill: "#D6D6DA",
                                            outline: "none"
                                        },
                                        hover: {
                                            fill: "#F53",
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
