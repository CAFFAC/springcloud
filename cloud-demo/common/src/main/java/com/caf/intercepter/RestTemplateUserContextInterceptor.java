package com.caf.intercepter;

import java.io.IOException;
import java.util.Map;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import com.caf.context.UserContextHolder;
import com.caf.vo.User;

/**
 * RestTemplate传递用户上下文
 * @author zhudeming
 */
public class RestTemplateUserContextInterceptor implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		User user = UserContextHolder.currentUser();
		Map<String, String> headers = user.toHttpHeaders();
		for (Map.Entry<String, String> header : headers.entrySet()) {
			request.getHeaders().add(header.getKey(), header.getValue());
		}
		// 调用
		return execution.execute(request, body);
	}
}
