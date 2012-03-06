package abstractfactory.impl.us;

import abstractfactory.PhoneNumber;



public class USPhoneNumber implements PhoneNumber {

	private static final String COUNTRY_CODE = "01";
	private static final int NUMBER_LENGTH = 12;

	private String phoneNumber;
	
	public String getCountryCode() {
		return COUNTRY_CODE;
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() == NUMBER_LENGTH) {
			this.phoneNumber = phoneNumber;
		}
	}

}
