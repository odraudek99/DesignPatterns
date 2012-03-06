package abstractfactory.impl;

import abstractfactory.Address;
import abstractfactory.AddressFactory;
import abstractfactory.PhoneNumber;

public class MXAddressFactory implements AddressFactory {
	public Address createAddress() {
		return new MXAddress();
	}

	public PhoneNumber createPhoneNumber() {
		return new MXPhoneNumber();
	}
}
