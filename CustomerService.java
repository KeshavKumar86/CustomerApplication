package customerapplication.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customerapplication.demo.entity.Customer;
import customerapplication.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
private CustomerRepository customerRepository;
	public List<Customer> getCustomer()
	{
		return customerRepository.findAll();
	}
	public void addCustomer(Customer customer)
	{
		customerRepository.save(customer);
		
	}

public CustomerRepository getCustomerRepository() {
	return customerRepository;
}

public void setCustomerRepository(CustomerRepository customerRepository) {
	this.customerRepository = customerRepository;
}

public CustomerService(CustomerRepository customerRepository) {
	super();
	this.customerRepository = customerRepository;
}

public CustomerService() {
	super();
	// TODO Auto-generated constructor stub
}

}
