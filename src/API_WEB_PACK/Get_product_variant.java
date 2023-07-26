package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_product_variant {
	@Test
	public void get_pdt_variant() {
	given().header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").
	header("Content-Type","application/json").header("Accept","application/json").

	when().get("https://api.bigcommerce.com/stores/5h8rqg02f8/v3/catalog/products/819/variants").then().log().all().extract().response();




	}
	}

