package GoogleDucks.api;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class JavaScript3 {

    @DisplayName("Search for Titles")
    @Test
    public void TestRun2() {
        JsonPath JP1 =
                given().
                        baseUri("https://jsonplaceholder.typicode.com/posts")
                        .log().all()
                        .queryParam("type", "title")
                        .queryParam("title ","nesciunt quas odio")
                        .queryParam("id",5).

                        when()
                        .get().
                        then().
                        log().all()
                        .statusCode(200)
                        .extract().jsonPath();

        List<String> AllTitles = JP1.getList("Search.titles", String.class);
        System.out.println("All Titles" + AllTitles);
    }
}