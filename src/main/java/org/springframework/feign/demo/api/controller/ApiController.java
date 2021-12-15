package org.springframework.feign.demo.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.feign.demo.api.bean.Author;
import org.springframework.feign.demo.api.bean.Request;
import org.springframework.feign.demo.http.controller.HttpController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public Author getAuthor(Request request) {
		LOG.info("request >> {}", request); 
		return new Author();
	}
}
