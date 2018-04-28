package architect.batch2.api.rough;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		/*
		 * Response response =given() .headers("Content-Type",
		 * "application/json") .when()
		 * .get("https://reqres.in/api/users?page=2") .then() .extract()
		 * .response(); System.out.println(response.getStatusLine());
		 * System.out.println(response.getBody().asString());
		 */

		/*
		 * map.put("name", "morpheus"); map.put("job", "leader"); Response
		 * response
		 * =given().contentType(ContentType.JSON).when().body(map).post(
		 * "https://reqres.in/api/users").then().extract() .response();
		 * 
		 * System.out.println(response.getBody().asString());
		 */

		/*
		 * map.put("name", "morpheus"); map.put("job", "gjhjh"); Response
		 * response =given().contentType(ContentType.JSON).when().body(map).put(
		 * "https://reqres.in/api/users/2").then().extract() .response();
		 * 
		 * System.out.println(response.getBody().asString());
		 */

		Response response = given().contentType(ContentType.JSON).when().delete("https://reqres.in/api/users/2").then()
				.extract().response();
		System.out.println(response.statusCode());

	}

}
