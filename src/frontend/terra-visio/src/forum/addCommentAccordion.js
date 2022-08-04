import Accordion from 'react-bootstrap/Accordion';
import { useAccordionButton } from 'react-bootstrap/AccordionButton';
import Card from 'react-bootstrap/Card';
import Form from 'react-bootstrap/Form';
import {useContext} from "react";
import {AccordionContext} from "react-bootstrap";
import Button from "react-bootstrap/Button";
import React from "react";


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
    return (
        <Accordion defaultActiveKey="0">
            <Card>
                <Card.Header>
                    <AddCommentToggle eventKey="1">Add comment</AddCommentToggle>
                </Card.Header>
                <Accordion.Collapse eventKey="1">
                    <Card.Body>
                        <Form>
                            <Form.Group className="mb-3" controlId="exampleForm.ControlTextarea1">
                                <Form.Label>Be nice!</Form.Label>
                                <Form.Control as="textarea" rows={3} />
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