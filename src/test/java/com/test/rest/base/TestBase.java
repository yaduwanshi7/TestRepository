package com.test.rest.base;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {

	public static RequestSpecification httpRequest;
	
	public static Response response;
	
	public static Logger logger;
	
	
	@BeforeClass
	public void setup() {
		
		logger = Logger.getLogger("Validate User Details");
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("<<<---------- Setup initiated ---------->>>");
		
		logger.info("<<<---------- Setup Completed ---------->>>");
		
	}
}