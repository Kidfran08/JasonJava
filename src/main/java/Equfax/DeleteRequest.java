package Equfax;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class DeleteRequest {
    @BeforeClass
    public void setup (){basePath=("http://dummy.restapiexample.com/api/v1/employees");}

    @Test
    public void Test1(){
        given().pathParam("id",1)
                .when().delete("/employee/{id}")
                .then().assertThat().statusCode(204);


        given().pathParam("id",1)
                .when().delete("/employee/{id}")
                .then().assertThat().statusCode(404);
    }
}
