package API_WEB_PACK;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.then;
public class Get_Abandoned_cart {
@Test
public void get_abnd_cart() {
given().header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").
header("Content-Type","application/json").header("Accept","application/json").

when().get("https://api.bigcommerce.com/stores/5h8rqg02f8/v3/abandoned-carts/FMfcgzGslbHXWPgxngJtLNXgCSQDcfMT").then().log().all().extract().response();




}
}
