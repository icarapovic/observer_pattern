# Observer pattern example

The simplest possible example of the observer pattern with detailed comments

Based on real-world example of a person walks through an automatic door.

**Person** - the observable, object that changes its state<br>
**AutomaticDoor** - the observer, observing the change of an observable and reacting to changes

1. The observable (*Person*) must extend the Observable class and implement 
2. The observer (*AutomaticDoor*) must implement the Observer interface and the *update()* method
3. Register the observer with the observable *(person.addObserver(automaticDoor)*)
4. All methods in the observable that introduce changes you want to be notified of should<br> 
call *setChanged()* to mark the observable data as changed and *notifyObservers(obj)*<br>
to trigger the *update()* methods in all registered observers
5. Handle all calls of the *update(a, b)* method depending on the passed param object **b**
