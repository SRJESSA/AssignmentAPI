package TestAPI;

public class AdPayload {
	
	public static String PostWeather()
	  
	{
	return  "{\r\n" + 
			"   \"coord\": {\r\n" + 
			"      \"lon\": 145.77,\r\n" + 
			"      \"lat\": -16.92\r\n" + 
			"   },\r\n" + 
			"   \"weather\": [\r\n" + 
			"      {\r\n" + 
			"         \"id\": 802,\r\n" + 
			"         \"main\": \"Clouds\",\r\n" + 
			"         \"description\": \"scattered clouds\",\r\n" + 
			"         \"icon\": \"03n\"\r\n" + 
			"      }\r\n" + 
			"   ],\r\n" + 
			"   \"base\": \"stations\",\r\n" + 
			"   \"main\": {\r\n" + 
			"      \"temp\": 300.15,\r\n" + 
			"      \"pressure\": 1007,\r\n" + 
			"      \"humidity\": 74,\r\n" + 
			"      \"temp_min\": 300.15,\r\n" + 
			"      \"temp_max\": 300.15\r\n" + 
			"   },\r\n" + 
			"   \"visibility\": 10000,\r\n" + 
			"   \"wind\": {\r\n" + 
			"      \"speed\": 3.6,\r\n" + 
			"      \"deg\": 160\r\n" + 
			"   },\r\n" + 
			"   \"clouds\": {\r\n" + 
			"      \"all\": 40\r\n" + 
			"   },\r\n" + 
			"   \"dt\": 1485790200,\r\n" + 
			"   \"sys\": {\r\n" + 
			"      \"type\": 1,\r\n" + 
			"      \"id\": 8166,\r\n" + 
			"      \"message\": 0.2064,\r\n" + 
			"      \"country\": \"AU\",\r\n" + 
			"      \"sunrise\": 1485720272,\r\n" + 
			"      \"sunset\": 1485766550\r\n" + 
			"   },\r\n" + 
			"   \"id\": 2172797,\r\n" + 
			"   \"name\": \"Cairns\",\r\n" + 
			"   \"cod\": 200\r\n" + 
			"}";
     }
}