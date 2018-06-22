package org.crazyit.cloud;

import org.crazyit.cloud.entity.Police;

import feign.Headers;
import feign.RequestLine;

public interface PoliceClient {
	
	@RequestLine("POST /createPolice")
	@Headers("Content-Type: application/json")
	public String createPolice(Police police);
	
	@RequestLine("POST /createXML")
	@Headers("Content-Type: application/xml")
	public String createXML();
}
