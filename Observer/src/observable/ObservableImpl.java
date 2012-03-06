package observable;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class ObservableImpl implements Observable {

	private List<Observer> observers = new ArrayList<Observer>();


	public void addObserver(Observer obs) {
		if (!observers.contains(obs)) {
			observers.add(obs);
		}		
	}

	public void removeObserver(Observer obs) {
		observers.remove(obs);		
	}
	
	public void notifyObservers() {
		
	}

}
