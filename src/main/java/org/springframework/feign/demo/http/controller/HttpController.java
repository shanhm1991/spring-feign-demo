package org.springframework.feign.demo.http.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.feign.demo.api.bean.Author;
import org.springframework.feign.demo.api.bean.Request;
import org.springframework.feign.demo.http.service.HttpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* 
* @author shanhm1991@163.com
* 
*/
@Controller
@RequestMapping("/http")
public class HttpController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HttpController.class);

	@Autowired
	private HttpService httpService;
	
	@RequestMapping("/author")
	@ResponseBody
	public Author getAuthor() {
		Author author =  httpService.getAuthor(new Request());
		LOG.info("response << {}", author);
		return author;
	}
}
