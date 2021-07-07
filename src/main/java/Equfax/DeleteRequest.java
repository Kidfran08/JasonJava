package Equfax;

import io.restassured.path.json.JsonPath;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.*;

public class DeleteRequest {


    @Test
    public void Test1(){
        JsonPath JP12=

        given().baseUri("http://dummy.restapiexample.com/api/v1/delete/1")
                .queryParam(" /employee/{id} ",1)
                .log().all().
                when().delete().then().log().all().extract().jsonPath();





                //pathParam("id",1)
                //.when().delete("/employee/id")
               // .then().assertThat().statusCode(204);


      // given().pathParam("id",1)
          //     .when().delete("/employee/id")
          //      .then().assertThat().statusCode(404);
    }
}
