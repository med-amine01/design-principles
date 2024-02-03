package com.chebbi.tech;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
    // Store used by controller
    private final UserPersistenceService persistenceService = new UserPersistenceService();
    private final UserMapper userMapper = new UserMapper();
    private final UserValidator userValidator = new UserValidator();

    //Create a new user
    public boolean createUser(String userJson) throws IOException {
        User user = userMapper.mapUser(userJson);

        if (!userValidator.validateUser(user)) {
            return false;
        }

        persistenceService.saveUser(user);

        return true;
    }
}