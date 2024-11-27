package TestCases;

import Base.Request_Specification;
import Routes.Route;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Categories {
    @Test
    public void getAllCategories(){
        given().spec(Request_Specification.ReqSpec())
                .when()
                .get(Route.Categories_Route)
                .then()
                .log().all()
                .extract().response();

    }
    @Test
    public void getSingleCategory(){
        given().spec(Request_Specification.ReqSpec())
                .when()
                .get(Route.Products_Route+"/jewelery")
                .then()
                .log().all()
                .extract().response();

    }
}
