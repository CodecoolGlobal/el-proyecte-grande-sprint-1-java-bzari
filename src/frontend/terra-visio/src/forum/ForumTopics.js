import {Container, ListGroup} from "react-bootstrap";
import Card from 'react-bootstrap/Card';
import {useParams} from "react-router-dom";
import React, {useEffect} from 'react';
import {useState} from "@types/react";


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
    })

    const createTopic = () => {
        const [title, setTitle] = useState('');
        const [description, setDescription] = useState('');
        const [timestamp, setTimestamp] = useState('');
        const [current_user, setUser] = useState(null);

        const handleSubmit = (e) => {
            e.preventDefault();
            const topic = { title, description, timestamp, current_user}

            fetch('/forum/topics/new', {
                method : 'POST',
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(topic)
            }).then(() => {
                console.log("topic added");
            })
        }
    }

    return(
        <Container>
            <Card>
            <Card.Title>Forum topics</Card.Title>
            <ListGroup>
                {forumTopicsData.length===0?"No location-data accessible":forumTopicsData.map(data => {
                return <ListGroup.Item action href={`/forum/topics/${data.id}/${data.title}`}>
                    <div className="ms-2 me-auto">
                        <div className="font-weight-bold">{data.title}</div>
                        Last updated: {data.timestamp}
                    </div>
                </ListGroup.Item>})}
            </ListGroup>
            </Card>
        </Container>
    )
}

export default Topics;