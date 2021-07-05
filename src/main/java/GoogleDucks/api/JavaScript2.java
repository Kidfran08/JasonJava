package GoogleDucks.api;
import static io.restassured.RestAssured.* ;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.hamcrest.Matchers.*;
public class JavaScript2 {

    @DisplayName("Search for employee information")
    @Test

    public void testRun(){
        get("http://dummy.restapiexample.com/")
                .then()
                .body("id",containsString("1"))
                .body("employee_name",is("Tiger Nixon"))
                .body("employee_salary",is(320800));
    }



    }

