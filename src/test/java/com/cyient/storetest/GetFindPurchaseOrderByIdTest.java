package com.cyient.storetest;

import io.restassured.RestAssured;

public class GetFindPurchaseOrderByIdTest {
	public static String baseUrl = "https://petstore.swagger.io/v2";

	public static void main(String[] args) {
		
		int id=46;
		String resource = "/store/order/"+id;
		
		
		RestAssured
		.given()
		.when().get(baseUrl+resource)
		.then().log().all().statusCode(200);

	}

}
