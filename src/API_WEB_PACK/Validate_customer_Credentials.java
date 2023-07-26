package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Validate_customer_Credentials {
	@Test
	public void cust_cred() {
		
		
		RestAssured.given().header("Content-Type", "application/json")
		.header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").

		contentType(ContentType.JSON).accept(ContentType.JSON).log().all()
		.body("{\r\n"
				+ "  \"email\": \"harish.hj@kapiva.in\",\r\n"
				+ "  \"password\": \"0e9e38ce2c2e52a1840a38a59665764a\",\r\n"
				+ "  \"channel_id\": 1\r\n"
				+ "}").when().
		post("https://api.bigcommerce.com/stores/5h8rqg02f8/v3/customers/validate-credentials").
		then().statusCode(200).log().body().
		extract().response();
	}

	}
