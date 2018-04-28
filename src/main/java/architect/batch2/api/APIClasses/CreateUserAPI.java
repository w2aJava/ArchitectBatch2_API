package architect.batch2.api.APIClasses;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUserAPI {

	public static Response sendPostRequestToCreateUserWithValidData(String endPoint,String inputBody) {
		Response response = given().contentType(ContentType.JSON).when().body(inputBody).post(endPoint).then().extract()
				.response();
		return response;

	}

}
