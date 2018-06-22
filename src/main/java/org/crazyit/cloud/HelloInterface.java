package org.crazyit.cloud;

import feign.RequestLine;

public interface HelloInterface {

	@RequestLine("GET /hello")
	public String hello();
}
