import React, { Component } from 'react';
import {
  Button,
  Image,
  Container,
  Row,
  Col,
  Card,
  CardColumns
} from 'react-bootstrap'
import Event from './event'
import Header from './Header';
import CreateTask from './CreateTask';
import PlayerDetails from "./PlayerDetails";
import Players from "./Players";
import Vote from './Rating';
var email

class Profile extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []

    }
    this.handleUpload = this.handleUpload.bind(this)
    this.handleActions = this.handleActions.bind(this)
    this.handleRating = this.handleRating.bind(this)
    this.handleEdit = this.handleEdit.bind(this)
    this.handleEvent=this.handleEvent.bind(this)
  }
  handleUpload() {
    window.location.href = '/upload'
  }
  handleActions() {
    window.location.href = '/actions'
  }
  handleRating() {
    window.location.href = '/rating'
  }
  handleEdit() {
    window.location.href = '/edit'
  }
  handleEvent(){
    window.location.href = '/event'
  }

  componentDidMount() {
   

    email =  window.sessionStorage.getItem("username")
    
    const url = 'http://localhost:9000/actionprofile/'+email
   
    let headers = new Headers();

    headers.append('Content-Type', 'application/json');
    headers.append('Accept', 'application/json');

    headers.append('Access-Control-Allow-origin', url);
    headers.append('Access-Control-Allow-Credentials', 'true');

    headers.append('POST', 'GET');

    fetch(url,{
        headers: headers,
        method: 'GET'

    })
    .then(response => response.json()) 
    .then(response => this.setState({ 'posts' : response})); 
         
}

  render() {
    const cardlist = this.state.posts.map(post => {
      return (

        <div key={post.actionid}>
          <br />
          <Card style={{ width: '20rem' }}>
            <Card.Header>{post.email}</Card.Header>
            <Card.Img variant="top" src={post.actionpath} thumbnail="true" />
            <Card.Body>
              <Card.Title>{post.actionname}</Card.Title>
              <Card.Text>{post.description}</Card.Text>
            </Card.Body>
            <Card.Footer>

              <small className="text-muted">Last updated 3 mins ago</small>
            </Card.Footer>
          </Card>

        </div>

      )
    })
    return (
      <div>
        <Header />
        <Container>
          <Row>
            <Col>
              <Image width="300px" height="300px" src="https://images-na.ssl-images-amazon.com/images/I/51zi1Kib-HL._SX466_.jpg"
                alt="user pic" rounded />
            </Col>
            <Col>
              <br />
              <br />
              <h2>User Name : {window.sessionStorage.getItem("username")}<br/></h2>
              <h2>First Name : {window.sessionStorage.getItem("firstname")}<br/></h2>
              <h2>Last Name : {window.sessionStorage.getItem("lastname")}<br/></h2>
              <h2>Phone Number : {window.sessionStorage.getItem("phoneno")}<br/></h2>
              <h2>Locality : {window.sessionStorage.getItem("locality")}<br/></h2>
              <h2>Pincode : {window.sessionStorage.getItem("pincode")}<br/></h2>
              
              <br/>
              
              
                    
                    
            </Col>
          </Row>
          <br/>
          <Row>
            <Col >
              <Row>
                <Col>
                
              <Button variant="danger" onClick={this.handleEvent}>
                    Event Details
                    </Button>
                    </Col>
                <Col>
              <Button variant="danger" onClick={this.handleEdit}>
                    Edit Profile
                    </Button>
                    </Col>
                <Col>
              <Button variant="danger" onClick={this.handleRating}>
                    Vote
                    </Button>
                  </Col>  
                <Col>
                  <Button variant="danger" onClick={this.handleUpload}>
                    Upload Your Actions
                    </Button>
                </Col>
              </Row>
            </Col>
            <Col sm={2}>
              <Button variant="danger" onClick={this.handleActions}>
                View Actions
              </Button>
            </Col>
          </Row> 
          <hr />
          <br />
          <Row>
            <CardColumns>
              {cardlist}
            </CardColumns>
          </Row>

        </Container>

      </div>
    );
  }
}

export default Profile;




