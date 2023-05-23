package io.project.testing;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.common.constraint.Assert;
import jakarta.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ResourceTest {
	
	@Inject
    @org.eclipse.microprofile.config.inject.ConfigProperty(name = "COLOR", defaultValue = "blue")
    String imageColor;
	
	@Test
    public void testColorEndpoint() {
		if("blue".equals(imageColor)) {
			given()
	        .when().get("/color")
	        .then()
	           .statusCode(200)
	           .body(is("blue"));
		} else {
			given()
	        .when().get("/color")
	        .then()
	           .statusCode(200)
	           .body(is("green"));
		}
	}
	
	@Test
    public void testImageEndpoint() {
		given()
        .when().get("/image")
        .then()
           .statusCode(200);
	}
	
	@Test
    public void testHandlerEndpoint() {
		String b = given().get("/").getBody().asString();
		Assert.assertTrue(b.contains("Handled by "));
	}

}
