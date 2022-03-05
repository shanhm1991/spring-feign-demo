package org.springframework.feign.demo.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.feign.demo.api.bean.Author;
import org.springframework.feign.demo.api.bean.Request;
import org.springframework.feign.demo.http.controller.HttpController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
* 
* @author shanhm1991@163.com
* 
*/
@Controller
@RequestMapping("/api")
public class ApiController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HttpController.class);

	@RequestMapping("/author")
	@ResponseBody
	public Author getAuthor(@RequestHeader("requestId") String requestId, Request request) {
		LOG.info("request[{}] >> {}", requestId, request);
		return new Author();
	}
}
