import React, { useState , useEffect} from 'react';
import { Button, Modal} from 'react-bootstrap';
import {ToggleButton} from 'react-bootstrap';
const EditTaskPopup = ({modal, ToggleButton, updateTask, taskObj}) => {
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

    useEffect(() => {
        setTaskName(taskObj.Name)
        setDescription(taskObj.Description)
    },[])

    const handleUpdate = (e) => {
        e.preventDefault();
        let tempObj = {}
        tempObj['Name'] = taskName
        tempObj['Description'] = description
        updateTask(tempObj)
    }

    return (
        <Modal show={modal} ToggelButton={ToggleButton}>
            <Modal.Header ToggleButton={ToggleButton}>Update Task</Modal.Header>
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
            <Button color="primary" onClick={handleUpdate}>Update</Button>{' '}
            <Button color="secondary" onClick={ToggleButton}>Cancel</Button>
            </Modal.Footer>
      </Modal>
    );
};

export default EditTaskPopup;