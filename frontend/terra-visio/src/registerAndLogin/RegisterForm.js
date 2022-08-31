import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import {useState} from "react";
import { useNavigate } from "react-router-dom";
import {Card} from "react-bootstrap";

function Registration() {

    // const { id } = useParams();
    const [username, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [type, setType] = useState("USER"); //String vs enum
    const navigate = useNavigate();




    const handleSubmit = (e) => {
        e.preventDefault();
        const registration = { username, email, password, type}
        fetch(`/user/registration`, {
            method : 'POST',
            headers: {"Content-Type" : "application/json"},
            body: JSON.stringify(registration)
        }).then(() => { navigate("/")
        })
    }

    return (
        <Card className="register">
        <Form onSubmit={handleSubmit}>
            <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>Email address</Form.Label>
                <Form.Control type="email" placeholder="Enter email" onChange={(e) =>
                    setEmail(e.target.value)}/>
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicUsername">
                <Form.Label>Username</Form.Label>
                <Form.Control type="text" placeholder="Enter username" onChange={(e) =>
                    setUsername(e.target.value)}/>
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>Password</Form.Label>
                <Form.Control type="password" placeholder="Password" onChange={(e) =>
                    setPassword(e.target.value)}/>
            </Form.Group>
            <Button variant="primary" type="submit">
                Submit
            </Button>
        </Form>
        </Card>
    );
}

export default Registration;
