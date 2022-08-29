package task_1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.delete;

/**
 * 1) Explain the purpose of this file, how we use it in this project?
 * 2) What can be improved? Please improve it online.
 * 3) What mistakes do you see?
 */
public class RestAssuredRequestTest {

    @Test
    public void testOne() {
        given().
                when().
                get("https://petstore.swagger.io/v2/pet/findByStatus?status=sold").
                then().
                assertThat().statusCode(200);
    }





    @Test
    public void testTwo() {
        given().
                when().

                get("https://petstore.swagger.io/v2/pet/findByStatus?status=uncreated").
                then().
                assertThat().statusCode(400);
    }

    @Test
    public void testThree() {
        given().

                when().

                get("https://petstore.swagger.io/v2/pet/findByStatus").
                then().
                assertThat().statusCode(400);
    }




}
