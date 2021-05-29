/*import React, { Component } from 'react';
import {
  Navbar,
  Nav,
  Image
} from 'react-bootstrap'
import Leader from './images/Leader1.jpg';

class App extends Component {
  render() {
    return (
      <div>
        <Navbar bg="dark" variant="dark">
          <Navbar.Brand href="/">
            <img
              alt=""
              src="https://cdn2.vectorstock.com/i/1000x1000/24/06/leader-vector-1662406.jpg"
              width="30"
              height="30"
              className="d-inline-block align-top"
            />{' '}
            ESTRO</Navbar.Brand>
          <Nav className="mr-auto">
            <Nav.Link href="/register">SIGNUP</Nav.Link>
            <Nav.Link href="/login">LOGIN</Nav.Link>
          </Nav>
        </Navbar>

        <div  className="each-slide">
                  <div><img src={Leader} height = "750px" width = "1800px"/></div>
              </div>
      </div >
    );
  }
}

export default App;*/

import React, { Component } from 'react';
import {
  Navbar,
  Nav,
  Image
} from 'react-bootstrap'

class App extends Component {
  render() {
    return (
      <div className="homepg">
        <Navbar bg="dark" variant="dark">
          <Navbar.Brand href="/">
            <img
              alt=""
              src="favicon.ico"
              width="30"
              height="30"
              className="d-inline-block align-top"
            />{' '}
            ALCHEMY</Navbar.Brand>
          <Nav className="mr-auto">
            <Nav.Link href="/register">Signup</Nav.Link>
            <Nav.Link href="/login">Login</Nav.Link>
          </Nav>
        </Navbar>

        <Image className="fp1" src="frontpage-1.gif"
          alt="user pic" />
          <Image className="fp2" src="frontpage-2.gif"
          alt="user pic" />
      </div >
    );
  }
}

export default App;





