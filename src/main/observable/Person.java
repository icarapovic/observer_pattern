package main.observable;

import main.utils.Movement;

import java.util.Observable;

/**
 * The object that changes over time needs to extend the Observable class
 *
 * The three methods simulate movement of a person
 * Each method, when called, marks the data as changed (setChanged)
 * and then notifies all registered observers that it has changed.
 * */
public class Person extends Observable {

    public void approachAutomaticDoor(){
        System.out.println("Approaching automatic door...");
        setChanged();
        notifyObservers(Movement.APPROACH);
    }

    public void walkThrough(){
        System.out.println("Walking right through the door...");
        setChanged();
        notifyObservers(Movement.WALKTHROUGH);
    }

    public void departFromAutomaticDoor(){
        System.out.println("Departing from the automatic door...");
        setChanged();
        notifyObservers(Movement.DEPART);
    }
}
