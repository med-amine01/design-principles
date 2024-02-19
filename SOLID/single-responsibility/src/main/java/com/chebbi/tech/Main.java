package com.chebbi.tech;

import java.io.IOException;

//Main class to test
public class Main {
    //A valid USER JSON String
    private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";

    //Invalid USER JSON String - email format wrong
    private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    public static void main(String[] args) throws IOException {
        UserController controller = new UserController();

        //Check with valid JSON
        boolean validResponse = controller.createUser(VALID_USER_JSON);
        //Check with invalid JSON
        boolean badResponse = controller.createUser(INVALID_USER_JSON);

        if (!validResponse) {
            System.err.println("Failed, Invalid JSON response");
        } else {
            System.out.println("Success, Valid JSON response");
        }

        if (!badResponse) {
            System.err.println("Failed, Invalid JSON response");
        } else {
            System.out.println("Success, Valid JSON response");
        }
    }

}
