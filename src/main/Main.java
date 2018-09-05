package main;

import main.observable.Person;
import main.observer.AutomaticDoor;

public class Main {
    public static void main(String[] args) {

        // instantiate the observer and the observable
        AutomaticDoor door = new AutomaticDoor();
        Person person = new Person();

        // register the observer (*let the person know the door is observing him*)
        person.addObserver(door);

        // print the start state of the door
        door.printDoorState();

        // walk through the door, observe behavior and state of the door
        person.approachAutomaticDoor();
        door.printDoorState();
        person.walkThrough();
        door.printDoorState();
        person.departFromAutomaticDoor();
        door.printDoorState();

        // remove the observer (*person went far away, door doesn't observe him anymore*)
        person.deleteObserver(door);
    }
}
