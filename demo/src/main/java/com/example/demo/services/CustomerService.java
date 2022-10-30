 package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Customer;
import com.example.demo.entities.PurchaseOrder;
import com.example.demo.entities.ShippingDetails;

public interface CustomerService {
	public List<Customer> getCustomers();

	public List<Customer> getCustomer(String city);
	
	public Customer addCustomer(Customer customer);

	public PurchaseOrder addOrder(PurchaseOrder order);

	public ShippingDetails addDetails(ShippingDetails details);

}
