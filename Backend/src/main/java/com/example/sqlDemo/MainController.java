package com.example.sqlDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@Controller
@CrossOrigin
@RequestMapping(path="/demo",
        method = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
public class MainController implements UserService{

    @Autowired
    private UserRepo UserRepo;

    @PostMapping(path = "/add")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        UserRepo.save(user);
        return "Saved";
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody Iterable<User> getUsers() {
        return UserRepo.findAll();
    }

    @GetMapping(path = "/getUser")
    public @ResponseBody Optional<User> getUser(@RequestParam int id) {
        return UserRepo.findById(id);
    }

    @PutMapping(path="/update")
    public @ResponseBody String updateName(@RequestParam int id, @RequestParam Map<String, String> userMap) {
        User userDB = UserRepo.findById(id).get();

        String name = userMap.get("name");
        String email = userMap.get("email");

        if (name != null && email != null) {
            userDB.setName(name);
            userDB.setEmail(email);
        }
        else {
            return "Missing Parameters";
        }
        UserRepo.save(userDB);
        return "Saved";
    }

    @DeleteMapping(path="/delete")
    public @ResponseBody String delete(@RequestParam int id) {
        UserRepo.deleteById(id);
        return "Successfully deleted user #" + id;
    }
}


