package main.observer;

import main.utils.Movement;
import main.utils.DoorState;

import java.util.Observable;
import java.util.Observer;

/**
 * Class that should react to changes should implement the Observer interface
 * and override the update method
 * */
public class AutomaticDoor implements Observer {

    // the door is by default closed
    private DoorState state = DoorState.CLOSED;

    @Override
    public void update(Observable o, Object arg) {
        // Cast the object into the appropriate type (be sure its the right class)
        Movement action = (Movement) arg;

        // update depending on the data in the object
        switch (action){
            case APPROACH: open(); break;
            case WALKTHROUGH: remainOpen(); break;
            case DEPART: close(); break;
        }
    }

    // print the current state of the door
    public void printDoorState(){
        System.out.println("STATE: " + state.toString());
    }

    // Print that the door opened, change its state to opened
    private void open(){
        System.out.println("The door opened");
        state = DoorState.OPEN;
    }

    // Print that the door remained open (when a person walks through it)
    private void remainOpen(){
        System.out.println("The door remained open");
        state = DoorState.OPEN;
    }

    // Print that the door has closed after the person passed through,
    // update its state to closed again
    private void close(){
        System.out.println("The door closed");
        state = DoorState.CLOSED;
    }
}
