package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class OTPLogin {


	@Test
	public void checking_user() {
		HashMap data=new HashMap();
		data.put("mobile", "9480507677");
		Response response=given().contentType("application/json")
		.body(data).when().post("https://kapiva.app/api/check_user.php?p=check_user&serve=st").
		then().statusCode(200).log().body().
		extract().response();
		System.out.println(response.asPrettyString());
	//String emailID=response.path("email");
		String password_hash=response.path("response[0].passwd_hash");
		String email =response.path("response[0].email");
		System.out.println("Email : " + email + "\n"+  "Password : " + password_hash);//System.out.println(emailID);
	
	}
	

	
}

