package TestAPI;
import io.restassured.RestAssured;
import Pojo.GetWeatherPojo;
import Resource.BaseUrl;
import static io.restassured.RestAssured.*;

public class GetWeather {

	public static void main(String[] args) {
		RestAssured.baseURI = BaseUrl.baseUri();
		GetWeatherPojo get_pojo = given().queryParam("q","London,uk","appid","439d4b804bc8187953eb36d2a8c26a02")
       .when().get("data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02")
       .as(GetWeatherPojo.class);
		System.out.println(get_pojo.getCoord().getLat()); 
		System.out.println(get_pojo.getCoord().getLon());
	}
}
