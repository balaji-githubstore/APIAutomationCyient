package com.cyient.storetest;

import io.restassured.RestAssured;

public class PostPlaceOrderForPetTest {
	
	public static String baseUrl="https://petstore.swagger.io/v2";

	public static void main(String[] args) {

		String resource="/store/order";
		
		RestAssured
		.given().header("Content-Type", "application/json").body("{\r\n"
				+ "    \"id\": 99,\r\n"
				+ "    \"petId\": 90555555555,\r\n"
				+ "    \"quantity\": 0,\r\n"
				+ "    \"shipDate\": \"2021-06-18T04:31:26.626Z\",\r\n"
				+ "    \"status\": \"placed\",\r\n"
				+ "    \"complete\": true\r\n"
				+ "}")
		.when().post(baseUrl+resource)
		.then().log().all().statusCode(200);
		
		
		

	}
}
