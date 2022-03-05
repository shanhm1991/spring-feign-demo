package org.springframework.feign.demo.http.service;

import feign.Param;
import org.springframework.feign.annotation.FeignClient;
import org.springframework.feign.demo.api.bean.Author;
import org.springframework.feign.demo.api.bean.Request;

import feign.Headers;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

/**
 * 
 * @author shanhm1991@163.com
 *
 */
@FeignClient(url = "${http.url}", readTimeoutMillis = 5000)
public interface HttpService {
	
	@RequestLine("POST /api/{user}")
	@Headers({"Content-Type: application/json", "requestId: {requestId}"})
	Author getAuthor(Request request, @Param("user") String user, @Param("requestId") String requestId);
}
