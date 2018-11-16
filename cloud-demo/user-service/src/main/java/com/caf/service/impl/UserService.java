package com.caf.service.impl;




import com.caf.service.IUserService;
import com.caf.service.dataservice.DataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 */
@Component
public class UserService implements IUserService {
	
    @Autowired
    private DataService dataService;
    
    @Autowired
    private RestTemplate restTemplate;
    
	@Override
	public String getDefaultUser() {
		return dataService.getDefaultUser();
	}

	@Override
	public String getContextUserId() {
		return dataService.getContextUserId();
	}

	@Override
	public List<String> getProviderData() {
		List<String> result = restTemplate.getForObject("http://data-service/getProviderData", List.class);
		return result;
	}
}
