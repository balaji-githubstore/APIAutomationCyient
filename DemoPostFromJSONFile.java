package com.johndeere.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DemoPostFromJSONFile {
	
	public static String baseUrl="https://petstore.swagger.io/v2/"; 
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String resource="pet";
		FileInputStream file=new FileInputStream("target/data.json");
		JsonPath json=new JsonPath(file);
		System.out.println(json.prettify());

		RestAssured
		.given().header("Content-Type", "application/json")
		.body(json.prettify()).when().post(baseUrl+resource).then().log().all().statusCode(200);
		
	}

}
