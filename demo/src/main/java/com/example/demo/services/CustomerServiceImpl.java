package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.PurchaseOrder;
import com.example.demo.entities.ShippingDetails;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	List<Customer>list;
	List<PurchaseOrder>purchaseList;
	List<ShippingDetails>details;
	public CustomerServiceImpl() {
		list=new ArrayList<>();
		purchaseList=new ArrayList<>();
		details=new ArrayList<>();
		list.add(new Customer(1,"Tejas","Shahtejas028@gmail.com","7300409215","Raipur"));
		list.add(new Customer(2,"Sonal","sonal@gmail.com","7300409215","bhilai"));
	}
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<Customer> getCustomer(String city) {
		List<Customer> c=new ArrayList<>();
		for(Customer customer:list) {
			if(customer.getCity().equals(city)) {
				c.add(customer);
			}
			
		}
		return c;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		list.add(customer);
		return customer ;
	}

	@Override
	public PurchaseOrder addOrder(PurchaseOrder order) {
		// TODO Auto-generated method stub
		purchaseList.add(order);
		return order;
	}

	@Override
	public ShippingDetails addDetails(ShippingDetails detail) {
		// TODO Auto-generated method stub
		details.add(detail);
		return detail;
	}

	
	

}
