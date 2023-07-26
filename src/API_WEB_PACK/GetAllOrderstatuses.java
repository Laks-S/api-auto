package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetAllOrderstatuses {
	
		@Test
		public void getallorder_status() {
		given().header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").
		header("Content-Type","application/json").header("Accept","application/json").

		when().get("https://api.bigcommerce.com/stores/5h8rqg02f8/v2/order_statuses").then().log().all().extract().response();




		}
		}

