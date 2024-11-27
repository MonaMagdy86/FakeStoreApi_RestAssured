package Base;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Request_Specification {
    public static RequestSpecification ReqSpec(){
        RequestSpecification request=
                given()
                        .baseUri("https://fakestoreapi.com")
                        .contentType(ContentType.JSON)
                        .log().all();
        return request;
    }
}
