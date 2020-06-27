package TestAPI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import Resource.BaseUrl;

public class GetWeatherUnsuccessful {

	public static void main(String[] args) {
    	RestAssured.baseURI = BaseUrl.baseUri();
	    given().queryParam("q", "London,uk")
	   .when().get("data/2.5/weather?q=London,uk")
	   .then().assertThat()
	   .statusCode(200)
	   .body("cod", equalTo(401), "message", equalTo("Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."));
	}
}