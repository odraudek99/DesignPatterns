package abstractfactory.impl.us;

import abstractfactory.Address;



public class USAddress extends Address {

	private static final String COUNTRY = "UNITED STATES";
	private static final String COMMA = ",";
	
	
	public String getCountry() {
		return COUNTRY;
	}
	
	public String getFullAddress() {
		return getStreet() + EOL_STRING + getCity() +
				COMMA + SPACE + getRegion() + SPACE +
				getPostCode() + EOL_STRING + COUNTRY +
				EOL_STRING;
	}

}
