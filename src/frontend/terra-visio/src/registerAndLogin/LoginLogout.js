import NavDropdown from "react-bootstrap/NavDropdown";


function LoginLogoutButton() {
    var buttonName = "Login";

    const handleClick = (e) => {
        e.preventDefault();
        if (buttonName === "Login"){

        }else if(buttonName === "Logout"){
            localStorage.removeItem("jwt-token")
        }
    }

    if(localStorage.getItem("jwt-token")){
            buttonName = "Logout"
        return (<NavDropdown.Item onClick={handleClick}> {buttonName} </NavDropdown.Item>)
    }else {
        buttonName = "Login"
        return (<NavDropdown.Item href={'/login'}> {buttonName} </NavDropdown.Item>)
    }

}



export default LoginLogoutButton;