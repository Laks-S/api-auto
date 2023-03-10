package API_WEB_PACK;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Create_cart {
@Test
public void create_cart() {
	RestAssured.given().header("Content-Type", "application/json")
	.header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").

	contentType(ContentType.JSON).accept(ContentType.JSON).log().all().body("{\r\n"
			+ "  \"customer_id\": 0,\r\n"
			+ "  \"line_items\": [\r\n"
			+ "    {\r\n"
			+ "      \"quantity\": 2,\r\n"
			+ "      \"product_id\": 126,\r\n"
			+ "       \"entityId\":721,\r\n"
			+ "      \"list_price\": 5,\r\n"
			+ "      \"name\": \"Get slim juice\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"channel_id\": 1,\r\n"
			+ "  \"currency\": {\r\n"
			+ "    \"code\": \"USD\"\r\n"
			+ "  },\r\n"
			+ "  \"locale\": \"en-US\"\r\n"
			+ "}").	when().post("https://api.bigcommerce.com/stores/5h8rqg02f8/v3/carts").then().statusCode(201).log().all().
	extract().response();
}
}
