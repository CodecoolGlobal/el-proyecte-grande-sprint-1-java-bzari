import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import {Col, Container, ListGroup, Row} from "react-bootstrap";
// import demo from './demo.jpg'
import shrimp from './Resources/shrimp.jpg'
import turtle from './Resources/turtle.jpg'


function BasicExample() {
    return (
        <Container>
        <Card text="dark">

                    <div className="info-page-title">Great Barrier Reef</div>

            <Row>
                <Col sm={8}>
            {/*<Card.Img variant="top" src="holder.js/100px180" />*/}


                <ListGroup variant="flush">

                    <ListGroup.Item>
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">Continent</div>
                            Australia
                        </div>
                    </ListGroup.Item>
                    <ListGroup.Item>
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">Info</div>
                            The Great Barrier Reef is the world's largest coral reef system composed of over 2,900 individual reefs and 900 islands stretching for over 2,300 kilometres. The Great Barrier Reef can be seen from outer space and is the world's biggest single structure made by living organisms. This reef structure is composed of and built by billions of tiny coral polyps. The Great Barrier Reef supports an extraordinary diversity of life, including many vulnerable or endangered species, some of which may be endemic to the reef system.
                        </div>
                    </ListGroup.Item>
                    <ListGroup.Item>
                        <div className="ms-2 me-auto">
                            <div className="font-weight-bold">Climate crisis</div>
                            Coral bleaching is the process when corals become white due to various stressors, such as changes in temperature, light, or nutrients. Bleaching occurs when coral polyps expel the algae that live inside their tissue, causing the coral to turn white. As a result of warming ocean temperatures, coral bleaching is spreading fast. In 2020, a study found that the Great Barrier Reef has lost more than half of its corals since 1995 due to warmer seas driven by climate change. Coral bleaching is expected to become an annual occurrence.
                        </div>
                    </ListGroup.Item>
                </ListGroup>

                </Col>
            <Col sm={4}>
                <div className="related">
                    <Card.Img variant="top" src={shrimp} />
                        <Card.Text>Peacock Mantis Shrimp</Card.Text>
                </div>
<div className="related">
                <Card.Img variant="top" src={turtle} />
                    <Card.Text>Green sea turtle</Card.Text>
</div>
            </Col>
            </Row>
            </Card>
            </Container>
    );
}

export default BasicExample;