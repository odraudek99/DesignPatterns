package abstractfactory.impl.us;

import abstractfactory.Address;
import abstractfactory.AddressFactory;
import abstractfactory.PhoneNumber;



public class USAddressFactory implements AddressFactory {

	public Address createAddress() {
		return new USAddress();
	}


	public PhoneNumber createPhoneNumber() {
		return new USPhoneNumber();
	}

}
