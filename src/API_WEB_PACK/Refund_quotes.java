package API_WEB_PACK;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Refund_quotes {
@Test
public void refund() {
	RestAssured.given().header("Content-Type", "application/json")
	.header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").

	contentType(ContentType.JSON).accept(ContentType.JSON).log().all().body	("{\r\n"
			+ "  \"order_id\": 1285354,\r\n"
			+ "  \"items\": [\r\n"
			+ "    {\r\n"
			+ "      \"item_type\": \"SHIPPING\",\r\n"
			+ "      \"item_id\": 1,\r\n"
			+ "      \"amount\": 1.99,\r\n"
			+ "      \"reason\": \"string\"\r\n"
			+ "    }\r\n"
			+ "  ]\r\n"
			+ "}").when().post("https://api.bigcommerce.com/stores/5h8rqg02f8/v3/orders/1285354/payment_actions/refund_quotes").then().statusCode(201).log().all().
	extract().response();	
}
}