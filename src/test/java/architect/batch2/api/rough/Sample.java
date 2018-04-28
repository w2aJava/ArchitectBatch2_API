package architect.batch2.api.rough;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	public static void main(String[] args) {

		// Get Method Example Response response =
		/*Response response=given().headers("Content-Type", "application/json").when().get("https://reqres.in/api/users").then().extract()
				.response();
		System.out.println(response.statusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println();
		response.body().prettyPrint();
		System.out.println(response.jsonPath().get("data"));*/
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request=RestAssured.given().contentType(ContentType.JSON);
		Response response=request.get("/api/users");
		System.out.println(response.getBody().asString());
		

		/*
		 * Map<String, String> map = new HashMap<String, String>(); //
		 * map.put("namettr", "Rahul"); map.put("job", "Java Trainer"); String
		 * String json = "{\"name\": \"morpheus\",\"job\": \"leader\"}";
		 * 
		 * // post method example Response response = Response response =
		 * given().contentType(ContentType.JSON).body(json).post(
		 * "https://reqres.in/api/users").then() .extract().response();
		 * System.out.println(response.getStatusCode()); //
		 * System.out.println(); response.body().prettyPrint();
		 */

		// Delete method example
		/*
		 * Response response= given().contentType(ContentType.JSON).
		 * delete("https://reqres.in/api/users/2").then().extract().response();
		 * System.out.println(response.getStatusLine());
		 */
		/*
		 * String json =
		 * "{\"name\": \"morpheus\",\"job\": \"Selenium Trainer\"}";
		 * 
		 * Response res = given().contentType(ContentType.JSON).body(json).put(
		 * "https://reqres.in/api/users/2").then() .extract().response();
		 * 
		 * System.out.println(res.getStatusLine());
		 * System.out.println(res.getBody().asString());
		 * System.out.println(res.jsonPath().get("name"));
		 */
	}

}
