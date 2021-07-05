package APITest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class SpartantTest {
    String SpartanBaseURL="https://docs.api.met.no/doc/nowcast";
    @Test
    public void viewSpartantTest1(){
     Response response = RestAssured.get(SpartanBaseURL+ "datamodel");
        System.out.println(response.statusCode());

        System.out.println(response.body().asString());

    }

}
