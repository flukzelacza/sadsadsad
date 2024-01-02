package PhoneNumber;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber {
	private String number;
	
	@JsonProperty
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneNumber ()
	{
		
	}
}
