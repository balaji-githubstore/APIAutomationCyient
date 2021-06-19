package com.cyient.petapitest;

import io.restassured.RestAssured;

public class GetFindPetByIdTest {
	
	public static String baseUrl="https://petstore.swagger.io/v2/"; //endpoint

	public static void main(String[] args) {
		//Path parameter
		int id=100;
		String resource="pet/"+id;
		System.out.println(baseUrl+resource);
		
		
		RestAssured
		.given().log().all()
		.when().get(baseUrl+resource)
		.then().log().all().statusCode(200);
		
//		RestAssured
//		.when().get(baseUrl+resource)
//		.then().statusCode(200);
	}

}
