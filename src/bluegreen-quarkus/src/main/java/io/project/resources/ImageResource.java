package io.project.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Path("/image")
public class ImageResource {
	
	@Inject
    @org.eclipse.microprofile.config.inject.ConfigProperty(name = "COLOR", defaultValue = "blue")
    String imageColor;

	@GET
    @Produces("image/png")
    public Response getImage() throws IOException {
        // Convertit la couleur spécifiée en objet Color
		 Color color = Color.BLUE;
		if("green".equals(imageColor)) {
			 color = Color.GREEN;
		}

        // Crée une nouvelle image avec une dimension de 100x100 pixels et un format RGB
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

        Graphics2D graphics = image.createGraphics();
        graphics.setColor(color);
        graphics.fillRect(0, 0, 200, 200);
        graphics.dispose();

        // Crée un flux de sortie pour écrire l'image encodée en PNG
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        javax.imageio.ImageIO.write(image, "png", baos);

        // Convertit l'image encodée en tableau de bytes
        byte[] imageData = baos.toByteArray();

        // Retourne la réponse HTTP avec l'image en tant que contenu
        return Response.ok(imageData, "image/png").build();
    }
}
