package customerapplication.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import customerapplication.demo.entity.Customer;
import customerapplication.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
private CustomerService customerService;
	@RequestMapping(method=RequestMethod.GET,value="/allcustomers")
	public List<Customer> getCustomer()
	{
		return customerService.getCustomer();
	}
	@RequestMapping(method=RequestMethod.POST,value="/addcustomer")
 public String addCustomer(@RequestBody Customer customer)
 {
	 customerService.addCustomer(customer);
	 return "Customer added successfully";
 }
public CustomerService getCustomerService() {
	return customerService;
}

public void setCustomerService(CustomerService customerService) {
	this.customerService = customerService;
}

public CustomerController(CustomerService customerService) {
	super();
	this.customerService = customerService;
}

public CustomerController() {
	super();
	// TODO Auto-generated constructor stub
}

}
