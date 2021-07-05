package GoogleDucks.api;
import static io.restassured.RestAssured.*;
;
import static org.hamcrest.Matchers.*;
import static scala.Predef.require;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JavaScrpitTest {

@DisplayName("search all ID numbers")
@Test
    public void init() {


    get("http://dummy.restapiexample.com/")
            .then()
            .body("id",contains("2"))
            .body("title",containsString("employee"))
            .body("employee_age",is(20))
            .body("employee_salary",is(1000))
    ;


    }
}