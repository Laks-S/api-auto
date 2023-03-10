

package API_WEB_PACK;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class kapiva_create_user {
	@Test
public void autosign() {
	HashMap data=new HashMap();
	data.put("first_name","Lakshmi");
	data.put("last_name", "Keerthi");
	data.put("email", "lakshmi.s1@kapiva.in");
	data.put("mobile", "9059575490");
	data.put("device_platform", "web");
	//Response res=
	given().contentType("application/json")
	.body(data).when().
	post("https://kapiva.app/api/user_autosignup.php?p=create_user&serve=st").
	then().statusCode(200).log().body().
	extract().response();
}

}
