import Accordion from 'react-bootstrap/Accordion';
import { useAccordionButton } from 'react-bootstrap/AccordionButton';
import Card from 'react-bootstrap/Card';
import Form from 'react-bootstrap/Form';
import {useContext, useState} from "react";
import {AccordionContext} from "react-bootstrap";
import Button from "react-bootstrap/Button";
import {useParams} from "react-router-dom";


function AddPostToggle({ children, eventKey, callback }) {
    const { activeEventKey } = useContext(AccordionContext);

    const decoratedOnClick = useAccordionButton(
        eventKey,
        () => callback && callback(eventKey),
    );

    const isCurrentEventKey = activeEventKey === eventKey;

    return (
        <Button variant="dark" onClick={decoratedOnClick}>
            {children}
        </Button>
    );
}

function PostButton() {
    const { id } = useParams();
    const [title, setTitle] = useState('');
    const [content, setContent] = useState('');
    const [timestamp, setTimestamp] = useState('');
    const [currentUser, setUser] = useState(null);
    const [replyCount, setReplyCount] = useState(0);
    const [viewCount, setViewCount] = useState(0);
    const [currentTopic, setTopic] = useState(null);



    const handleSubmit = (e) => {
        e.preventDefault();
        const post = { title, content, timestamp, currentUser, replyCount, viewCount, currentTopic}

        fetch(`/forum/${id}/newPost`, {
            method : 'POST',
            headers: {"Content-Type" : "application/json", "Authorization" : localStorage.getItem("jwt-token")},
            body: JSON.stringify(post)
        }).then(() => {
        }, [])
    }
    return (
        <Accordion defaultActiveKey="0">
            <Card>
                <Card.Header>
                    <AddPostToggle eventKey="1">Add post</AddPostToggle>
                </Card.Header>
                <Accordion.Collapse eventKey="1">
                    <Card.Body>
                        <Form onSubmit={handleSubmit}>
                            <Form.Group className="mb-3" controlId="exampleForm.ControlTextarea1">
                                <Form.Label>Title</Form.Label>
                                <Form.Control
                                    onChange={(e) =>
                                        setTitle(e.target.value)}
                                />
                                <Form.Label>Description</Form.Label>
                                <Form.Control as="textarea" rows={3}
                                              type="text"
                                              onChange={(e) =>
                                                  setContent(e.target.value)}
                                />
                            </Form.Group>
                            <Button variant="dark" type="submit">
                                Submit
                            </Button>
                        </Form>
                    </Card.Body>
                </Accordion.Collapse>
            </Card>
        </Accordion>
    );
}

export default PostButton;