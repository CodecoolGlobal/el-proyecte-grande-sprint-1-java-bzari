import {Col, Container, ListGroup, Row} from "react-bootstrap";
import Card from 'react-bootstrap/Card';
import {useParams} from "react-router-dom";
import React, {useEffect} from "react";
import Button from "react-bootstrap/Button";
import PostButton from "./addPostAccordion";


function Posts(){
    const { title, id } = useParams();
    const [topicPostsData, setTopicPostsData] = React.useState([])
    useEffect(() => {
        fetch(`/forum/topics/${id}`,
            {method:"GET",
                headers:{"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setTopicPostsData(data))
    })

    return(
        <Container>
            <Card>
                <Row>
                    <Col>
                        <Card.Title as="h1">{title}</Card.Title>
                    </Col>
                </Row>
                <Row>
                    <Col>
                    <Card.Subtitle as="h5">{topicPostsData.description}</Card.Subtitle>
                    </Col>
                </Row>
                <ListGroup>
                    {topicPostsData.length===0?"No location-data accessible":topicPostsData.posts?.map(data => {
                    return <ListGroup.Item action href={`/forum/topics/posts/${data.id}/${data.title}`}>
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">{data.title}</div>
                            Uploaded by: {data.user.username} at {data.timestamp}
                        </div>
                    </ListGroup.Item>})}

                </ListGroup>
                <PostButton/>
            </Card>
        </Container>
    )
}

export default Posts;