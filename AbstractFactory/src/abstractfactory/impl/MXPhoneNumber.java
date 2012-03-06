package abstractfactory.impl;

import abstractfactory.PhoneNumber;

public class MXPhoneNumber implements PhoneNumber {
	private static final String COUNTRY_CODE = "52";
	private static final int NUMBER_LENGTH = 10;
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