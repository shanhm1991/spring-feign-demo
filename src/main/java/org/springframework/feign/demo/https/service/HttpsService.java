package org.springframework.feign.demo.https.service;

import org.springframework.feign.annotation.FeignClient;
import org.springframework.feign.demo.api.bean.Author;
import org.springframework.feign.demo.api.bean.Request;
import org.springframework.feign.demo.https.ssl.HttpsHostnameVerifier;
import org.springframework.feign.demo.https.ssl.HttpsSSLSocketFactory;

import feign.Headers;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

/**
 * 
 * @author shanhm1991@163.com
 *
 */
@FeignClient(url = "${https.url}", readTimeoutMillis = 5000,
sslCertPath="${https.keystore}",
sslPasswd="${https.keystore.passwd}",
sslSocketFactory=HttpsSSLSocketFactory.class,
hostnameVerifier=HttpsHostnameVerifier.class)
public interface HttpsService {
	
	@RequestLine("POST /api/author")
	@Headers("Content-Type: application/json")
	Author getAuthor(Request request);
}
