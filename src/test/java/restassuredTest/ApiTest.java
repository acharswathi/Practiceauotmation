package restassuredTest;


import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApiTest 
{
	
	@Test
	public void testapi() 
	{		
		Response rest= RestAssured.get("https://reqres.in/api/unknown/2");
		int code=rest.getStatusCode();
		System.out.println("status code"+ code);
		Assert.assertEquals(200, code);
		System.out.println(rest.getBody().asString());
	}
	
	@Test
	public void TestPost()
	{
		String params={""\"name"\n"= "morpheus",
			    "job": "leader"
			}
		Response res=RestAssured.post("https://reqres.in/api/unknown/2");
		
	}
	
	
	
}

