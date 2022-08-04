import {Container, ListGroup} from "react-bootstrap";
import Card from 'react-bootstrap/Card';
import {useParams} from "react-router-dom";
import React, {useEffect} from "react";


function Posts(){
    const { title, id } = useParams();
    const [topicPostsData, setTopicPostsData] = React.useState([])
    useEffect(() => {
        fetch(`/forum/topics/${id}/posts`,
            {method:"GET",
                headers:{"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setTopicPostsData(data))
    })

    return(
        <Container>
            <Card>
                    <Card.Title>{title}</Card.Title>
                <ListGroup>
                    {topicPostsData.length===0?"No location-data accessible":topicPostsData.map(data => {
                    return <ListGroup.Item action href={`/forum/topics/posts/${data.id}/${data.title}/`}>
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">{data.title}</div>
                            Uploaded by: {data.user.username} at {data.timestamp}
                        </div>
                    </ListGroup.Item>})}

                </ListGroup>
            </Card>
        </Container>
    )
}

export default Posts;