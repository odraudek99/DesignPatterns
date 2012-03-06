package abstractfactory.impl;

import abstractfactory.Address;

public class MXAddress extends Address {
	private static final String COUNTRY = "MEXICO";
	private static final String COMMA = ",";

	public String getCountry() {
		return COUNTRY;
	}

	public String getFullAddress() {
		return getStreet() + EOL_STRING + getCity() + COMMA + SPACE
				+ getRegion() + SPACE + getPostCode() + EOL_STRING + COUNTRY
				+ EOL_STRING;
	}
}
