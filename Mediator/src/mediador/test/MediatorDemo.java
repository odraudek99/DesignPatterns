package mediador.test;

import mediador.Mediator;
import mediador.consumer.Consumer;
import mediador.producer.Producer;

public class MediatorDemo {		

	  public static void main( String[] args ) {
		  
		  
	    Mediator mb = new Mediator();
	    new Producer( mb ).start();
	    new Producer( mb ).start();
	    new Consumer( mb ).start();
	    new Consumer( mb ).start();
	    new Consumer( mb ).start();
	    new Consumer( mb ).start();
	  }	

}
