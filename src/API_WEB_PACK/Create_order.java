package API_WEB_PACK;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
public class Create_order {
@Test
public void create_order() {
	//JsonPath j=new JsonPath();
	
	//j.getInt(lineItems.count());
	
	///lineItems li=new lineItems();
	//li.setquantity(2);
	//li.setproductId(230);
	
	//List<lineItems> jsonArraylineItems=new ArrayList<>();
	//jsonArraylineItems.add(li);
	//System.out.println(jsonArraylineItems.size());
	//System.out.println(jsonArraylineItems);
	//HashMap cartbody=new HashMap(); 
	//cartbody = {
		//	"body": {
			//	"lineItems":"jsonArraylineItems"
			//}
	//}
RestAssured.given().header("Content-Type", "application/json")
.header("X-Auth-Token", "ddm1fct3nofvzvhwqlxq48qv2cnlns1").

contentType(ContentType.JSON).accept(ContentType.JSON).log().all().body("{\r\n"
		+ "  \"billing_address\": {\r\n"
		+ "    \"first_name\": \"Jane\",\r\n"
		+ "    \"last_name\": \"Doe\",\r\n"
		+ "    \"street_1\": \"123 Main Street\",\r\n"
		+ "    \"city\": \"Austin\",\r\n"
		+ "    \"state\": \"Texas\",\r\n"
		+ "    \"zip\": \"78751\",\r\n"
		+ "    \"country\": \"United States\",\r\n"
		+ "    \"country_iso2\": \"US\",\r\n"
		+ "    \"email\": \"janedoe@email.com\"\r\n"
		+ "  },\r\n"
		+ "  \"products\": [\r\n"
		+ "    {\r\n"
		+ "      \"name\": \"BigCommerce Coffee Mug\",\r\n"
		+ "      \"quantity\": 1,\r\n"
		+ "      \"price_inc_tax\": 50,\r\n"
		+ "      \"price_ex_tax\": 45\r\n"
		+ "    }\r\n"
		+ "  ]\r\n"
		+ "}").when().post("https://api.bigcommerce.com/stores/5h8rqg02f8/v2/orders").then().statusCode(201).log().all().
extract().response();	
	
}}
	
	
	