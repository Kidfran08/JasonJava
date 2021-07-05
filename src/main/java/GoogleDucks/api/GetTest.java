package GoogleDucks.api;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetTest {
    @DisplayName("Search for Employee")
    @Test

    public void TestForEmployee(){
        JsonPath JP11=
                given().
                        baseUri("http://dummy.restapiexample.com/api/v1/employees")
                        .log().all()
                        .queryParam("id",1).
                        queryParams("employee_name","Garrett Winters").when()


                        .get().
                        then().log().all().statusCode(200).extract().jsonPath();
    }
}

