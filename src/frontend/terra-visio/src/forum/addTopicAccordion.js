import Accordion from 'react-bootstrap/Accordion';
import { useAccordionButton } from 'react-bootstrap/AccordionButton';
import Card from 'react-bootstrap/Card';
import Form from 'react-bootstrap/Form';
import {useContext} from "react";
import {AccordionContext} from "react-bootstrap";
import Button from "react-bootstrap/Button";
import {useState} from "react";



function AddTopicToggle({ children, eventKey, callback }) {
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

function TopicButton() {
        const [title, setTitle] = useState('');
        const [description, setDescription] = useState('');
        const [timestamp, setTimestamp] = useState('');
        const [currentUser, setUser] = useState(null);

        const handleSubmit = (e) => {
            e.preventDefault();
            const topic = { title, description, timestamp, currentUser}

            console.log()

            fetch('/forum/topics/new', {
                method : 'POST',
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(topic)
            }).then(() => {
            })
        }

    return (
        <Accordion defaultActiveKey="0">
            <Card>
                <Card.Header>
                    <AddTopicToggle eventKey="1">Add topic</AddTopicToggle>
                </Card.Header>
                <Accordion.Collapse eventKey="1">
                    <Card.Body>
                        <Form onSubmit={handleSubmit}>
                            <Form.Group className="mb-3" controlId="exampleForm.ControlTextarea1" >
                                <Form.Label>Title</Form.Label>
                                <Form.Control type="text"
                                              onChange={(e) =>
                                                  setTitle(e.target.value)}/>
                                <Form.Label>Description</Form.Label>
                                <Form.Control as="textarea" rows={3}
                                              type="text"
                                              onChange={(e) =>
                                                  setDescription(e.target.value)}
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


export default TopicButton;