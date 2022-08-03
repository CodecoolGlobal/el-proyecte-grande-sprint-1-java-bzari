import {Container, ListGroup} from "react-bootstrap";
import Card from 'react-bootstrap/Card';


function Posts(){
    return(
        <Container>
            <Card>
                <Card.Title>"Topic title"</Card.Title>
                <ListGroup>

                    <ListGroup.Item action href="#link1">
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">"Post title"</div>
                            Uploaded by: "user" at "time"
                        </div>
                    </ListGroup.Item>
                    <ListGroup.Item action href="#link2">
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">"Post title"</div>
                            Uploaded by: "user" at "time"
                        </div>
                    </ListGroup.Item>
                    <ListGroup.Item action href="#link3">
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">"Post title"</div>
                            Uploaded by: "user" at "time"
                        </div>
                    </ListGroup.Item>
                </ListGroup>
            </Card>
        </Container>
    )
}

export default Posts;