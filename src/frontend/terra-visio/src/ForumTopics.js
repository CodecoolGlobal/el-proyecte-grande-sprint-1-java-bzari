import {Container, ListGroup} from "react-bootstrap";
import Card from 'react-bootstrap/Card';


function Topics(){
    return(
        <Container>
            <Card>
            <Card.Title>Forum topics</Card.Title>
            <ListGroup>

                <ListGroup.Item action href="#link1">
                    <div className="ms-2 me-auto">
                        <div className="font-weight-bold">"Topic title"</div>
                        Last updated: "time"
                    </div>
                </ListGroup.Item>
                <ListGroup.Item action href="#link2">
                    <div className="ms-2 me-auto">
                        <div className="font-weight-bold">"Topic title"</div>
                        Last updated: "time"
                    </div>
                </ListGroup.Item>
                <ListGroup.Item action href="#link3">
                    <div className="ms-2 me-auto">
                        <div className="font-weight-bold">"Topic title"</div>
                        Last updated: "time"
                    </div>
                </ListGroup.Item>
            </ListGroup>
            </Card>
        </Container>
    )
}

export default Topics;