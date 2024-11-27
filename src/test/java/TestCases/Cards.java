package TestCases;

import Base.Request_Specification;
import Routes.Route;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Cards {
    @Test
    public void getAllCards(){
        given().spec(Request_Specification.ReqSpec())
                .when()
                .get(Route.Cards_Route)
                .then()
                .log().all()
                .extract().response();

    }
    @Test
    public void deleteCard(){
        given().spec(Request_Specification.ReqSpec())
                .when()
                .delete(Route.Cards_Route+"/5")
                .then()
                .log().all()
                .extract().response();

    }
}
