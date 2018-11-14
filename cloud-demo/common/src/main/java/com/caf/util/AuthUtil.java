package com.caf.util;
import javax.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;

import com.caf.vo.User;

public class AuthUtil {
	public static boolean authUser(User user, HttpServletResponse respone) throws Exception{
		if(StringUtils.isEmpty(user.getUserId())) {
			return false;
		}else {
			return true;
		}
	}
}
