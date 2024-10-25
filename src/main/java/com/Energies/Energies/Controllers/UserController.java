package com.Energies.Energies.Controllers;

import com.Energies.Energies.Entities.User;
import com.Energies.Energies.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Create or update User
    @PostMapping
    public ResponseEntity<User> createOrUpdateUser(@RequestBody User user) {
        User saveUser = userService.saveUser(user);
        return  new ResponseEntity<>(saveUser, HttpStatus.CREATED);
    }

    //Get User by Id
    @GetMapping("/{documentId}")
    public ResponseEntity<User> getUserById(@PathVariable int documentId) {
        Optional<User> user = userService.getUserById(documentId);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Get all User
    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);

    }

    //Delete User by Id
    @DeleteMapping("/{documentId}")
    public ResponseEntity<Void> deleteUser(@PathVariable int documentId) {
        userService.deleteUser(documentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /*@PutMapping("/{documentId}")
    public ResponseEntity<Void> updateUser(@PathVariable int documentId, @RequestBody User user) {
        User partialUpdateUser = new User();
        if (user.getName() != null) {
            partialUpdateUser.setName(user.getName());
        }
        if (user.getLastName() != null) {
            partialUpdateUser.setLastName(user.getLastName());
        }
        if (user.getAddress() != null) {
            partialUpdateUser.setAddress(user.getAddress());
        }
        if (user.getEmail() != null) {
            partialUpdateUser.setEmail(user.getEmail());
        }
    }*/

}
