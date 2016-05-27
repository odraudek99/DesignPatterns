
package observer.test;

import observer.observable.Observable;
import observer.observable.impl.ObservableImpl;
import observer.observer.Observer;
import observer.observer.impl.ObserverImpl;


public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Observable subject = new ObservableImpl();
		Observer observer = new ObserverImpl(subject);
				
		subject.setValues(1, 3.1f);

	}

}
