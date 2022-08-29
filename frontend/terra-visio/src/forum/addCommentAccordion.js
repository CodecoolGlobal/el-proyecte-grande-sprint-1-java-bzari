import Accordion from 'react-bootstrap/Accordion';
import { useAccordionButton } from 'react-bootstrap/AccordionButton';
import Card from 'react-bootstrap/Card';
import Form from 'react-bootstrap/Form';
import {useContext, useState} from "react";
import {AccordionContext} from "react-bootstrap";
import Button from "react-bootstrap/Button";
import React from "react";
import {useParams} from "react-router-dom";


function AddCommentToggle({ children, eventKey, callback }) {
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

function CommentButton() {
    const { id } = useParams();
    const [message, setMessage] = useState('');
    const [timestamp, setTimestamp] = useState('');
    const [currentUser, setUser] = useState(null);
    const [upVote, setUpVote] = useState(0);
    const [currentPost, setPost] = useState(null);


    const handleSubmit = (e) => {
        e.preventDefault();
        const comment = { message, timestamp, currentUser, upVote, currentPost}
        fetch(`/forum/${id}/new_Comment`, {
            method : 'POST',
            headers: {"Content-Type" : "application/json", "Authorization" : localStorage.getItem("Authorization")},
            body: JSON.stringify(comment)
        }).then(() => {
        }, [])
    }
    return (
        <Accordion defaultActiveKey="0">
            <Card>
                <Card.Header>
                    <AddCommentToggle eventKey="1">Add comment</AddCommentToggle>
                </Card.Header>
                <Accordion.Collapse eventKey="1">
                    <Card.Body>
                        <Form onSubmit={handleSubmit}>
                            <Form.Group className="mb-3" controlId="exampleForm.ControlTextarea1">
                                <Form.Label>Be nice!</Form.Label>
                                <Form.Control as="textarea" rows={3}
                                              type="text"
                                              onChange={(e) =>
                                              setMessage(e.target.value)}
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

export default CommentButton;