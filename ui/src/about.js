import React, { Component } from 'react';
import {Image} from 'react-bootstrap';


class about extends Component {
  render() {
    return (
      <div>
        <Image className="ab1" src='./about-1.gif'/>
        <Image className="ab2" src='./about-2.png'/>
         
      </div >
    );
  }
}

export default about;