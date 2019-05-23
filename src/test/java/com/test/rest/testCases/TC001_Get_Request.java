package com.test.rest.testCases;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.rest.Promotions;
import com.test.rest.base.TestBase;
import com.test.rest.utilities.ReadConfig;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;


public class TC001_Get_Request extends TestBase{
	
	ReadConfig readConfig = new ReadConfig();
	
	@BeforeClass
	void getUserDetails() {
		
		logger.info("<<<---------- Validating User Details Started ---------->>>");
		
		RestAssured.baseURI = readConfig.getFixUrl();
		
		httpRequest = RestAssured.given();
		
		response = httpRequest.request(Method.GET,readConfig.getEndPointUrl());
		
		logger.info("<<<---------- Validating User Details Completed ----------->>>");
		
	}
	
	@Test
	void checkResponseBody() {
		
		logger.info("<<<---------- Validating Response Body Started ----------->>>");		
		
		String responseBody = response.getBody().asString();
		
		logger.info("Response Body is -: " + responseBody);
		
		Assert.assertTrue(responseBody!=null);
		
		logger.info("<<<---------- Validating response body Completed ----------->>>");
	}
		
	@Test
	void checkStatusCode() {
		
		logger.info("<<<---------- Validating Status Code Started ----------->>>");	
	
		int statusCode = response.getStatusCode();
		
		logger.info("Status code is -: " + statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		logger.info("<<<---------- Validating Status Code Completed ----------->>>");
	}
	
	@Test
	void checkStatusLine() {
		
		logger.info("<<<---------- Validating Status Line Started ----------->>>");
		
		String statusLine = response.getStatusLine();
		
		logger.info("Status code is -: " + statusLine);
		
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		logger.info("<<<---------- Validating Status Line Completed ----------->>>");
		
	}
	
	@Test
	void validateName() {
		
		logger.info("<<<---------- Acceptance Criteria 1 -: Validation of Name Started ----------->>>");
		
		JsonPath jsonpath = response.jsonPath();
		
		String name = jsonpath.get("Name");
	
		Assert.assertEquals(name, "Carbon credits");
		
		logger.info("<<<---------- Acceptance Criteria 1 -: Validation of Name Completed ----------->>>");
		
	}
	
	
	@Test
	void validateCanRelist() {
		
		logger.info("<<<---------- Acceptance Criteria 2 -: Validation of CanRelist Started ----------->>>");
		
		JsonPath jsonpath = response.jsonPath();
		
		boolean canrelist = jsonpath.getBoolean("CanRelist");
		
		logger.info("canRelist value received from Response is " + canrelist);
		
		Assert.assertEquals(canrelist, true);
		
		logger.info("<<<---------- Acceptance Criteria 2 -: Validation of CanRelist Started ----------->>>");
	
	}
	
	@Test
	void validatePromotion() throws Exception {
		
		logger.info("<<<---------- Acceptance Criteria 3 -: Validation of Promotions Started ----------->>>");
		
		JsonPath jsonpath = response.jsonPath();

		List<Promotions> objPromotions = jsonpath.getList("Promotions", Promotions.class);
		
		for(int i=0; i<3; i++)
		{

			if(objPromotions.get(i).getName().equals("Gallery") && objPromotions.get(i).getDescription().contains("2x larger image"))
			{
				Assert.assertTrue(true);
				System.out.println("<<<---------- Assert was successful, Test Case Passed ----------->>>");
				break;
			}
			else if(i==2) {
				Assert.assertTrue(false);
				System.out.println("<<<---------- Assert was unsuccessful, Test Case Failed ----------->>>");
			}
		}
		
		logger.info("<<<---------- Acceptance Criteria 3 -: Validation of Promotions Completed ----------->>>");
	}
}