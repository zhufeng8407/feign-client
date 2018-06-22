package org.crazyit.cloud;

import feign.Feign;

public class HelloMain {


	public static void main(String[] args) {
		HelloInterface hello = Feign.builder()
                .target(HelloInterface.class, "http://localhost:9001");
		System.out.println(hello.hello());
	}

}
