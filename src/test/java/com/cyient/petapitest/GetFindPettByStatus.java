package com.cyient.petapitest;

import io.restassured.RestAssured;

public class GetFindPettByStatus {
	public static String baseUrl="https://petstore.swagger.io/v2/"; //endpoint
	
	public static void main(String[] args) {
		
		String resource="pet/findByStatus";
		
		RestAssured
		.given().queryParam("status", "sold")
		.when().get(baseUrl+resource)
		.then().log().all().statusCode(200);

		
	}

}
