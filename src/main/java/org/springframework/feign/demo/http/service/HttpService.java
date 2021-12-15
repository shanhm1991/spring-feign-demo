package org.springframework.feign.demo.http.service;

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
@FeignClient(url = "${http.url}", readTimeoutMillis = 5000, 
encoder = JacksonEncoder.class, decoder = JacksonDecoder.class)
public interface HttpService {
	
	@RequestLine("POST /api/author")
	@Headers("Content-Type: application/json")
	Author getAuthor(Request request);
}
