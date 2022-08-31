import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import {useState} from "react";
import { useNavigate } from "react-router-dom";
import {Card} from "react-bootstrap";


function LoginForm() {

    // const { id } = useParams();
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();
        const login = { username, password}
        fetch(`/login`, {
            method : 'POST',
            // withCredentials: true,
            headers: {"Content-Type" : "application/json"},
            body: JSON.stringify(login)
        }).then( response => {
            if(response.headers.get("Authorization")){
            localStorage.setItem('jwt-token', response.headers.get("Authorization"))}
        }, navigate('/'))
    }

    return (
        <Card className="register">
        <Form onSubmit={handleSubmit}>

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
                Login
            </Button>
        </Form>
        </Card>
    );
}



export default LoginForm;
