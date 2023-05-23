package io.project.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/color")
public class ColorResource {
	
	@Inject
    @org.eclipse.microprofile.config.inject.ConfigProperty(name = "COLOR", defaultValue = "blue")
    String imageColor;
	
	/**
	 * Get the color from the environment variable COLOR
	 * @return String color
	 */
	@GET
	public String getColor() {
		String color = "blue";
		if("green".equals(imageColor)) {
			 color = "green";
		}

		return color;
		
	}

}
