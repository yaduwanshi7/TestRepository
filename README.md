                                    REST API test for Assurity Consulting Limited

API:

https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

Test Acceptance Criteria:

•	Name = "Carbon credits"

•	CanRelist = true

•	The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"

Prerequisites:

•	Eclipse should be installed
•	Configure TestNG plugin and Maven in Eclipse
•	Export the project from GitHub to local machine
•	JDK 1.8 or higher should be installed
•	Import the Project in Eclipse

Framework Structure:

•	Maven – Used for building project (framework)
•	TestNG – Test case execution
•	Log4J – For generating proper logs
•	Extent Report – For generating test execution report in html format
•	Rest Assured – For API automation
•	Json


How to run the test:

Right click on TestNG.xml or pom.xml and click Run As  TestNG Suite

Output Example:

[RemoteTestNG] detected TestNG version 6.14.3
 INFO [main] (TestBase.java:28)- <<<---------- Setup initiated ---------->>>
 INFO [main] (TestBase.java:30)- <<<---------- Setup Completed ---------->>>
 INFO [main] (TC001_Get_Request.java:26)- <<<---------- Validating User Details Started ---------->>>
 INFO [main] (TC001_Get_Request.java:34)- <<<---------- Validating User Details Completed ----------->>>
 INFO [main] (TC001_Get_Request.java:41)- <<<---------- Validating Response Body Started ----------->>>
 INFO [main] (TC001_Get_Request.java:45)- Response Body is -: {"CategoryId":6327,"Name":"Carbon} 
 INFO [main] (TC001_Get_Request.java:49)- <<<---------- Validating response body Completed ----------->>>
 INFO [main] (TC001_Get_Request.java:55)- <<<---------- Validating Status Code Started ----------->>>
 INFO [main] (TC001_Get_Request.java:59)- Status code is -: 200
 INFO [main] (TC001_Get_Request.java:63)- <<<---------- Validating Status Code Completed ----------->>>
 INFO [main] (TC001_Get_Request.java:69)- <<<---------- Validating Status Line Started ----------->>>
 INFO [main] (TC001_Get_Request.java:73)- Status code is -: HTTP/1.1 200 OK
 INFO [main] (TC001_Get_Request.java:77)- <<<---------- Validating Status Line Completed ----------->>>
 INFO [main] (TC001_Get_Request.java:102)- <<<---------- Acceptance Criteria 2 -: Validation of CanRelist Started ----------->>>
 INFO [main] (TC001_Get_Request.java:108)- canRelist value received from Response is true
 INFO [main] (TC001_Get_Request.java:112)- <<<---------- Acceptance Criteria 2 -: Validation of CanRelist Started ----------->>>
 INFO [main] (TC001_Get_Request.java:84)- <<<---------- Acceptance Criteria 1 -: Validation of Name Started ----------->>>
 INFO [main] (TC001_Get_Request.java:94)- <<<---------- Acceptance Criteria 1 -: Validation of Name Completed ----------->>>
 INFO [main] (TC001_Get_Request.java:119)- <<<---------- Acceptance Criteria 3 -: Validation of Promotions Started ----------->>>
<<<---------- Assert was successful, Test Case Passed ----------->>>
 INFO [main] (TC001_Get_Request.java:146)- <<<---------- Acceptance Criteria 3 -: Validation of Promotions Completed ----------->>>

===============================================
REST API Suite
Total tests run: 6, Failures: 0, Skips: 0
===============================================

How to see the HTML Test Report:

Go to test-output folder and open Test-Report-2019.05.23*TimeStamp*
