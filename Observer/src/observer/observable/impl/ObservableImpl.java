package observer.observable.impl;

import java.util.ArrayList;
import java.util.List;
import observer.observable.Observable;
import observer.observer.Observer;

public class ObservableImpl implements Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	private float calif;

	public void addObserver(Observer obs) {
		if (!observers.contains(obs)) {
			observers.add(obs);
		}		
	}

	public void removeObserver(Observer obs) {
		observers.remove(obs);		
	}
	
	public void notifyObservers() {
		for (Observer iObserver : observers) {
			iObserver.update(state, calif);
			
		}
	}

	public void setValues(int state, float calif) {
		this.state = state;
		this.calif = calif;
		notifyObservers();
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}

	public float getCalif() {
		return calif;
	}

	public void setCalif(float calif) {
		this.calif = calif;
		notifyObservers();
	}

	
	
}
