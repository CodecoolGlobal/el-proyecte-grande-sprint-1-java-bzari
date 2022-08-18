import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import Logo from './Logo';
import {List, PersonCircle} from 'react-bootstrap-icons';
import {Container, Form} from "react-bootstrap";
import IconButton from '@mui/material/IconButton';
import SearchIcon from '@mui/icons-material/Search';


function Header(){
    return (
        <Navbar bg="dark" variant="dark" sticky="top">
            <Container>
                <Navbar.Brand href="/" as={Logo} />
            </Container>
            <Navbar.Toggle/>
            <Navbar.Collapse className="justify-content-end">
                <Nav className="me-auto">
                        <NavDropdown title={<List />} id="basic-nav-dropdown">
                            <NavDropdown.Item href="/forum">Forum</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.2">Charities</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.3">Random</NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                    <Nav className="me-auto">
                        <NavDropdown title={<PersonCircle />} id="basic-nav-dropdown">
                            <NavDropdown.Item href="/login">Login</NavDropdown.Item>
                            <NavDropdown.Divider />
                            <NavDropdown.Item href="/register">
                                Register
                            </NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                <Form className="d-flex">
                    <Form.Control
                        type="search"
                        placeholder="Search"
                        className=""
                        aria-label="Search"
                    />
                    {<IconButton>
                    <SearchIcon/>
                    </IconButton>}
                </Form>
            </Navbar.Collapse>
        </Navbar>
    );
}

export default Header;