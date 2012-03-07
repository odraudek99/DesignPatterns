package observer.observer.impl;

import observer.observable.Observable;
import observer.observer.GUI;
import observer.observer.Observer;

public class ObserverImpl implements Observer, GUI {

	private int state;
	private float calif;
	private Observable observable;
	
	public ObserverImpl(Observable obs) {
		this.observable = obs;
		obs.addObserver(this);
	}
	
	
	public void update(int state, float calif) {
		this.state = state;
		this.calif = calif;
		this.display();
	}
	
	
	public void display() {
		System.out.println("Updated: state = "+ state + "; calif = " + calif);
		
	}
	


	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public float getCalif() {
		return calif;
	}


	public void setCalif(float calif) {
		this.calif = calif;
	}


		
	
}
