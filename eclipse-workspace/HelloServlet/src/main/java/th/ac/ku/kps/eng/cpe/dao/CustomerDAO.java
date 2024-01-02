package th.ac.ku.kps.eng.cpe.dao;

import java.util.ArrayList;

import Customer.Customer;

public class CustomerDAO {

	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Customer> getAllCustomers(){
		ArrayList<Customer> listofCustomer = new ArrayList<>();
		
		Customer c1 = new Customer("Mr.Smith");
		Customer c2 = new Customer("Mrs. Smith");
		
		listofCustomer.add(c1);
		listofCustomer.add(c2);
		
		return listofCustomer;
	}
}
