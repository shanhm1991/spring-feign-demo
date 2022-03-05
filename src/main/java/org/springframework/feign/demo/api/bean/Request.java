package org.springframework.feign.demo.api.bean;
/**
* 
* @author shanhm1991@163.com
* 
*/
public class Request {

	private String id = "001";
	
	private String user = "shanhm";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", user=" + user + "}";
	}
}
