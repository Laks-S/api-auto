package API_WEB_PACK;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
public class lineItems {
private int quantity;
private int productId;
public int getquantity() {
	return quantity;
	
}
public int getproductId() {
	return productId;
}
public void setquantity(int i) {
	// TODO Auto-generated method stub
	this.quantity=i;
}
public void setproductId(int i) {
	// TODO Auto-generated method stub
	//payload.toString()
	
	this.productId=i;
}
return "{\r\n"
		+ "  \"lineItems\": [\r\n"
		+ "    {\r\n"
		+ "      \"quantity\": 2,\r\n"
		+ "      \"productId\": 230,\r\n"
		+ "      \"optionSelections\": [\r\n"
		+ "        {\r\n"
		+ "          \"optionId\": 10,\r\n"
		+ "          \"optionValue\": \"Some Text Value\"\r\n"
		+ "        }\r\n"
		+ "      ]\r\n"
		+ "    }\r\n"
		+ "  ],\r\n"
		+ "  \"locale\": \"en\"\r\n"
		+ "}";

