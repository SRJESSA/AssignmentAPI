package TestAPI;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import Resource.BaseUrl;

public class AddWeather {

	public static void main(String[] args) {
	
		    RestAssured.baseURI = BaseUrl.baseUri();
			given().queryParam("id","2172797")
		   .queryParam("appid","439d4b804bc8187953eb36d2a8c26a02")
		   .header("User-Agent","PostmanRuntime/7.26.1")
		   .body("PostWeather.AddPayload")
		   .when().post("data/2.5/weather?id=2172797&appid=439d4b804bc8187953eb36d2a8c26a02")
		   .then().assertThat()
		   .statusCode(404);
	}
}
