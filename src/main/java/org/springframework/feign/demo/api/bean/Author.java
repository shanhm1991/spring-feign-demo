package org.springframework.feign.demo.api.bean;
/**
* 
* @author shanhm1991@163.com
* 
*/
public class Author {

	private String name = "shanhm";
	
	private String email = "shanhm1991@163.com";
	
	private String blog = "https://shanhm1991.github.io/";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	@Override
	public String toString() {
		return "{name=" + name + ", email=" + email + ", blog=" + blog + "}";
	}
}
