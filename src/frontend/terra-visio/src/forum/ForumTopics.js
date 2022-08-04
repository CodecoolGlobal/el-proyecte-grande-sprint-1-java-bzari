import {AccordionContext, Col, Container, ListGroup, Row} from "react-bootstrap";
import Card from 'react-bootstrap/Card';
import {useParams} from "react-router-dom";
import React, {useEffect} from 'react';

import {useState} from "react";
import TopicButton from "./addTopicAccordion";

function Topics(){
    const { name } = useParams();
    console.log(name)
    const [forumTopicsData, setForumTopicsData] = React.useState([])
    useEffect(() => {
        fetch(`/forum/topics`,
            {method:"GET",
                headers:{"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setForumTopicsData(data))
    },[])

    return(
        <Container>
            <Card>
                <Row>
                    <Col>
                        <Card.Title as="h1">Forum topics</Card.Title>
                    </Col>
                </Row>
            <ListGroup>
                {forumTopicsData.length===0?"No location-data accessible":forumTopicsData.map(data => {
                return <ListGroup.Item action href={`/forum/topics/${data.id}/${data.title}`}>
                    <div className="ms-2 me-auto">
                        <div className="font-weight-bold">{data.title}</div>
                        Last updated: {data.timestamp}
                    </div>
                </ListGroup.Item>})}
            </ListGroup>
                <TopicButton/>
                )}
            </Card>
        </Container>
    )
}


export default Topics;