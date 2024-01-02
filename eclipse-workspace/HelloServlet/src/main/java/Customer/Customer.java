package Customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	private String name ;
	
	
	@JsonProperty ("nameMT")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer()
	{
		
	}
	public Customer(String name)
	{
		this.name = name;
	}
}
