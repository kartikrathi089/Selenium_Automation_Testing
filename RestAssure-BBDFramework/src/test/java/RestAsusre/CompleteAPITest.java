package RestAsusre;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
// Run All
public class CompleteAPITest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.basePath = "";
    }

    @Test(priority = 1)
    // Run | Debug
    public void testTraditionalApproach() {
        System.out.println("\n\n========== TRADITIONAL APPROACH ==========");

        // Create JSON object
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Traditional Post");
        requestBody.put("body", "Testing traditional approach");
        requestBody.put("userId", 1);

        // Send request
        RequestSpecification request = given();
        request.header("Content-Type", "application/json");
        request.body(requestBody.toString());
        Response response = request.post("/posts");

        // Print all details
        printResponseDetails(response, "Traditional");
        
        
    }
    public void printResponseDetails(Response response, String method) {
        System.out.println("===== " + method + " Response =====");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body:");
        System.out.println(response.getBody().asPrettyString());
    }
}

