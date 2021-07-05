package Equfax;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
public class GetRequest {

    @DisplayName("Search for Employee info")
    @Test

    public void TestForEmployee(){
        JsonPath JP11=
                given().
                        baseUri("http://dummy.restapiexample.com/api/v1/employee/1")
                .log().all()
                .queryParam("id",1)
                .queryParam("employee_name","Tiger")
                .queryParam("employee_salary",300000).
                        queryParam("employee_age",60).
                        when()
                        .get().
                        then().log().all().statusCode(200).extract().jsonPath();
    }
}
