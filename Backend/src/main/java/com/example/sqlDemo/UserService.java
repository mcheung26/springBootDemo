package com.example.sqlDemo;

import java.util.Map;

public interface UserService {
    String addUser(String name, String email);
    Iterable<User> getUsers();
    String updateName(int id, Map<String, String> userMap);
    String delete(int id);

}
