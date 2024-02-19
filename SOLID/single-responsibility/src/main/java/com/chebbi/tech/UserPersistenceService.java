package com.chebbi.tech;

public class UserPersistenceService {

    private final Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }
}