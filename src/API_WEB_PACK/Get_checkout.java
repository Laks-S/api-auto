package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_checkout {
	@Test
	public void get_checkko() {
	given().header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").
	header("Content-Type","application/json").header("Accept","application/json").

	when().get("https://api.bigcommerce.com/stores/5h8rqg02f8/v3/checkouts/172f01e0-cc9f-4147-b7e8-162845d6ef7b").then().log().all().extract().response();



}
}