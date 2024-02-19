package com.chebbi.tech;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserMapper {
    private final ObjectMapper mapper = new ObjectMapper();

    public User mapUser(String userJson) throws IOException {
        // Mapping user from json
        return mapper.readValue(userJson, User.class);
    }
}