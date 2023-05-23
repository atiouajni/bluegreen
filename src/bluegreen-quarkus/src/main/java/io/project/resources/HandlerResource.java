package io.project.resources;

import java.net.InetAddress;
import java.net.UnknownHostException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HandlerResource {
	
	
	/**
	 * Get the hostname
	 * @return
	 * @throws UnknownHostException
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHostname() throws UnknownHostException {

		return "Handled by "+ InetAddress.getLocalHost().getHostName();
		
	}

}
