package API_WEB_PACK;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Track_order {
@Test
public void trackoreder() {
	RestAssured.given().header("Content-Type", "application/json").
	contentType(ContentType.JSON).accept(ContentType.JSON).log().all().body("{\"order_id\": \"1203154\"}").when().post("https://dashboard.kapiva.in/kapiva/order_tracking_details").then().log().
	all().extract().response();
				
}
}
