package com.my.study.microconsumer;


import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

	private final AccountServiceClient accountServiceClient;
	
	@Autowired
	CustomerRestController(AccountServiceClient accountServiceClient) {
		this.accountServiceClient = accountServiceClient;
	}
	

	@RequestMapping(method = RequestMethod.GET, value = "/names")
	
	public Collection <Customer> getCustomer() {
	  
		return this.accountServiceClient.read().getContent().stream().collect(Collectors.toList());
    
	}
}
