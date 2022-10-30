package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Customer;
import com.example.demo.entities.PurchaseOrder;
import com.example.demo.entities.ShippingDetails;
import com.example.demo.services.CustomerService;

@RestController
public class MyController {
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return this.customerservice.getCustomers();
	}
	@GetMapping("/customers/{city}")
	public List<Customer> getCustomer(@PathVariable String city){
		return this.customerservice.getCustomer(city);
	}
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return this.customerservice.addCustomer(customer);
	}
	@PostMapping("/purchaseOrder")
	public PurchaseOrder addPurchaseOrder(@RequestBody PurchaseOrder order) {
		return this.customerservice.addOrder(order);
	}
	@PostMapping("/shippingDetails")
	public ShippingDetails addshipping(@RequestBody ShippingDetails details) {
		return this.customerservice.addDetails(details);
	}
}
