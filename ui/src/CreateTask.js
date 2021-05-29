import React,{ useState,Component } from 'react';
/*import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';*/
import {Modal} from 'react-bootstrap';
import { Button} from 'react-bootstrap';
//import ToggleButton from '@bit/react-bootstrap.react-bootstrap.toggle-button';
//import {ModalHeader} from 'react-bootstrap';
//import ToggleButtonGroup from 'react-bootstrap/ToggleButtonGroup';
//import ToggleButton from 'react-bootstrap/ToggleButton';
import {ToggleButton} from 'react-bootstrap';
const CreateTaskPopup = ({modal, ToggleButton, save}) => {
    const [taskName, setTaskName] = useState('');
    const [description, setDescription] = useState('');

    const handleChange = (e) => {
        
        const {name, value} = e.target

        if(name === "taskName"){
            setTaskName(value)
        }else{
            setDescription(value)
        }




    }

    const handleSave = (e) => {
        e.preventDefault()
        let taskObj = {}
        taskObj["Name"] = taskName
        taskObj["Description"] = description
        save(taskObj)

    };
   
   
      
    return (
        
        <Modal show={modal}  ToggleButton={ToggleButton}>
            { 
            <div>
            <Modal.Header ToggleButton={ToggleButton}>Create Task</Modal.Header>
            <Modal.Body>
            
                    <div className = "form-group">
                        <label>Task Name</label>
                        <input type="text" className = "form-control" value = {taskName} onChange = {handleChange} name = "taskName"/>
                    </div>
                    <div className = "form-group">
                        <label>Description</label>
                        <textarea rows = "5" className = "form-control" value = {description} onChange = {handleChange} name = "description"></textarea>
                    </div>
                
            </Modal.Body>
            <Modal.Footer>
            <Button color="primary" onClick={handleSave}>Create</Button>{' '}
            <Button color="secondary" onClick={ToggleButton}>Cancel</Button>
            </Modal.Footer>
            
            
            
            </div>
            }
            
      </Modal>
      
    );
    
};

export default CreateTaskPopup;