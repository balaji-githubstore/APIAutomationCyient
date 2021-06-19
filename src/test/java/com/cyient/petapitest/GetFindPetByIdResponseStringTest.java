package com.cyient.petapitest;

import io.restassured.RestAssured;

public class GetFindPetByIdResponseStringTest {
	
	public static String baseUrl="https://petstore.swagger.io/v2/"; //endpoint

	public static void main(String[] args) {
		//Path parameter
		int id=90;
		String resource="pet/"+id;
		System.out.println(baseUrl+resource);
		
		String actualResponse=RestAssured
		.given()
		.when().get(baseUrl+resource)
		.then().extract().asString();
		
		System.out.println(actualResponse);
		
		System.out.println(actualResponse.contains("cat_007"));
		
//		RestAssured
//		.when().get(baseUrl+resource)
//		.then().statusCode(200);
	}

}
