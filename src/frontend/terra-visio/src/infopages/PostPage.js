import Card from 'react-bootstrap/Card';
import {Container, ListGroup} from "react-bootstrap";
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import {useParams} from "react-router-dom";
import React, {useEffect} from "react";


function SinglePostPage() {
    const { title, id } = useParams();
    const [singlePostData, setSinglePostData] = React.useState([])
    useEffect(() => {
        fetch(`/forum/posts/${id}`,
            {method:"GET",
                headers:{"accept":"application/json"}})
            .then(res => res.json())
            .then(data => setSinglePostData(data))
    })

    return(
        <Container>
        <Card>
            <Card.Title>{title}</Card.Title>
            <Card.Text>Uploaded by: "user" at "time"</Card.Text>
                <Card.Subtitle>{singlePostData.content}</Card.Subtitle>
        </Card>
            <Card>
            <Form>
                <Form.Group className="mb-3" controlId="exampleForm.ControlTextarea1">
                    <Form.Label>Add your comment</Form.Label>
                    <Form.Control as="textarea" rows={3} />
                </Form.Group>
                <Button variant="dark" type="submit">
                    Submit
                </Button>
            </Form>
            </Card>

<Card>
            <ListGroup>
                {singlePostData.length===0?"No location-data accessible":singlePostData.replies?.map(data => {
                    return <ListGroup.Item>
                        <div>{data.message}</div>
                        <div>Commented by: "user" at "time""</div>
                    </ListGroup.Item>})}
                </ListGroup>
            </Card>
        </Container>
    )
}

export default SinglePostPage;