package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_payment_methods {
@Test
public void get_payment() {
	given().header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").
	header("Content-Type","application/json").header("Accept","application/json").

	when().get("https://api.bigcommerce.com/stores/5h8rqg02f8/v2/payments/methods").then().log().all().extract().response();	
}
}
