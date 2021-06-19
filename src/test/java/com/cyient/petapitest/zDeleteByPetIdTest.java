package com.cyient.petapitest;

import io.restassured.RestAssured;

public class zDeleteByPetIdTest {

	public static String baseUrl="https://petstore.swagger.io/v2"; //endpoint
	
	public static void main(String[] args) {
		
		int petId=90;
		String resource="/pet/"+petId;
		
		System.out.println(baseUrl+resource);

		
		RestAssured
		.given()
		.when().delete(baseUrl+resource)
		.then().log().all().statusCode(200);
		
	}

}
