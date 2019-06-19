package com.woniuxy.test;

import org.springframework.stereotype.Repository;

@Repository("test")
public class Test {
	public String test() {
		return "hello";
	}
}
