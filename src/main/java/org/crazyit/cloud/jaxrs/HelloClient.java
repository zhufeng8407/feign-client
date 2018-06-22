package org.crazyit.cloud.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public interface HelloClient {

	@GET
	@Path("/hello")
	public String sayHello();
}
