package com.my.study.microconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("accounts-service")

public interface AccountServiceClient {
	
	@RequestMapping(method = RequestMethod.GET, value ="/customerdatas")
	Resources<Customer> read();

}

