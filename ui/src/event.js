import logo from './logo.svg';
import './event.css';
import TodoList from './TodoList'
import Card from './Card';
import CreateTask from './CreateTask'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'font-awesome/css/font-awesome.min.css'
import React, { Component } from 'react';

class Event extends Component{
render() {
  return (
    <div>
      <TodoList />
    </div>
  );
}
}

export default Event;

