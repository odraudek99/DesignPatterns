package abstractfactory.client;

import abstractfactory.Address;
import abstractfactory.AddressFactory;
import abstractfactory.PhoneNumber;
import abstractfactory.impl.mx.MXAddressFactory;
import abstractfactory.impl.us.USAddressFactory;

public class ClientAbstractFactory {


	public static void main(String[] args) {
	
		AddressFactory addressFactory = new USAddressFactory();
		Address addressUS = addressFactory.createAddress();
		addressUS.setPostCode("100101");
		PhoneNumber phone = addressFactory.createPhoneNumber();
		phone.setPhoneNumber("098765432109");
		
		System.out.println("US: " + phone.getPhoneNumber() + "; " + addressUS.getPostCode());
		
		
		
		addressFactory = new MXAddressFactory();
		Address addressMX = addressFactory.createAddress();
		addressMX.setPostCode("98712");
		phone = addressFactory.createPhoneNumber();
		phone.setPhoneNumber("0123456789");
		
		System.out.print("MX: " + phone.getPhoneNumber() + "; " + addressMX.getPostCode());

	}
}
