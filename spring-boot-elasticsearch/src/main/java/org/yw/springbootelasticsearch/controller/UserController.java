package org.yw.springbootelasticsearch.controller;
import org.elasticsearch.action.delete.DeleteResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.yw.springbootelasticsearch.model.User;
import org.yw.springbootelasticsearch.model.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/rest/users")
public class UserController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/all")
    @ResponseBody
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @RequestMapping("/id/{userId}")
    @ResponseBody
    public User getUser(@PathVariable String userId) {
        LOG.info("Getting user with ID: {}", userId);
        Optional<User> user = userRepository.findById(userId);
        LOG.info("User with ID: {} is {}", userId, user);
        return user.get();
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public User addNewUsers(@RequestBody User user) {
        LOG.info("Adding user : {}", user);
        userRepository.save(user);
        LOG.info("Added user : {}", user);
        return user;
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public String deleteUser(@PathVariable final String id) {

        userRepository.deleteById(id);

        return "delete User with id: "+id;
    }

}
