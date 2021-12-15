package org.springframework.feign.demo.https.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.feign.demo.api.bean.Author;
import org.springframework.feign.demo.api.bean.Request;
import org.springframework.feign.demo.https.service.HttpsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* 
* @author shanhm1991@163.com
* 
*/
@Controller
@RequestMapping("/https")
public class HttpsController {
	
	@Autowired
	private HttpsService httpsService;

	@RequestMapping("/author")
	@ResponseBody
	public Author getAuthor() {
		return httpsService.getAuthor(new Request());
	}
}
