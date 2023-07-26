package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.api.gax.rpc.StatusCode;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Track_order {

	@Test
	public void track_order() {
	given().header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").
	header("Content-Type","application/json").header("Accept","application/json").

	when().
	get("https://kapiva.app/api/get_order_shipment_new.php?orderId=1281829").then().log().all().extract().response();



	
}
}
