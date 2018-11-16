package com.caf.service.fallback;




import com.caf.service.dataservice.DataService;

import org.springframework.stereotype.Component;

/**
 */
@Component
public class UserClientFallback implements DataService {
	
	@Override
	public String getDefaultUser() {
		return new String("get getDefaultUser failed");
	}
	@Override
	public String getContextUserId() {
		return new String("get getContextUserId failed");
	}
	
}
