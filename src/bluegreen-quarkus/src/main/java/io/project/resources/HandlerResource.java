package io.project.resources;

import java.net.InetAddress;
import java.net.UnknownHostException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HandlerResource {
	
	
	/**
	 * Get the hostname
	 * @return
	 * @throws UnknownHostException
	 */
	@GET
	public String getHostname() throws UnknownHostException {

		return "Handled by "+ InetAddress.getLocalHost().getHostName();
		
	}

}
