package org.crazyit.cloud.jaxrs;


import feign.Feign;
import feign.jaxrs.JAXRSContract;

public class HelloMain {

	public static void main(String[] args) {
		HelloClient hello = Feign.builder()
				.contract(new JAXRSContract())
                .target(HelloClient.class, "http://localhost:9001");
		System.out.println(hello.sayHello());
	}

}
