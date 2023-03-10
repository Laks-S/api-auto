package API_WEB_PACK;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;
public class Check_user_kapiva {

	@Test
	public void checking_user() {
		HashMap data=new HashMap();
		data.put("mobile", "9059575");
		given().contentType("application/json")
		.body(data).when().post("https://kapiva.app/api/check_user.php?p=check_user&serve=st").
		then().statusCode(200).log().body().
		extract().response();
	
	}
}
