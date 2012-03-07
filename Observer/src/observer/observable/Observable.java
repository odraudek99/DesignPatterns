package observer.observable;

import observer.observer.Observer;

public interface Observable {

	public void addObserver(Observer obs);
	public void removeObserver(Observer obs);
	public void notifyObservers();
	
	public void setValues(int state, float calif);
	
}
