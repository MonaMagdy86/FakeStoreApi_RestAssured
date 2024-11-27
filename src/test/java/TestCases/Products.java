package TestCases;

import Base.Request_Specification;
import PojoClasses.AddProduct;
import Routes.Route;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Products {
    @Test
    public void getAllProducts(){
        given().spec(Request_Specification.ReqSpec())
                .when()
                .get(Route.Products_Route)
                .then()
                .log().all()
                 .extract().response();

    }
    @Test
    public void getSingleProduct(){
        given().spec(Request_Specification.ReqSpec())
                .when()
                .get(Route.Products_Route+"/4")
                .then()
                .log().all()
                .extract().response();

    }
    @Test
    public void addProduct(){
        AddProduct add=new AddProduct("test product","18.5","lorem ipsum set","https://i.pravatar.cc","electronic");
        given().spec(Request_Specification.ReqSpec())
                .when()
                .body(add)
                .post(Route.Products_Route)
                .then()
                .log().all()
                .extract().response();

    }
}
