package com.Energies.Energies.Services;

import com.Energies.Energies.Entities.User;
import com.Energies.Energies.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Insert or update User
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //Get User by id
    public Optional<User> getUserById(int documentId) {
        return userRepository.findById(documentId);
    }

    //Get all Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Delete User by id
    public void deleteUser(int document) {
        userRepository.deleteById(document);
    }
}
    //Method to  update a  User by  Id
    /*public User updateUserById(int documentId, User updatedUser) {
        //Check if Users  exists

        return userRepository.findById(documentId).map(existingUser -> {
                    //Update Fields

                    if (updatedUser.getName() != null) {
                        existingUser.setName(updatedUser.getName());
                    }
                    if (updatedUser.getLastName() != null) {
                        existingUser.setLastName(updatedUser.getLastName());
                    }
                    if (updatedUser.getAddress() != null) {
                        existingUser.setAddress(updatedUser.getAddress());
                    }
                    if (updatedUser.getEmail() != null) {
                        existingUser.setEmail(updatedUser.getEmail());
                    }
                }}
            //Save  updated User
            return userRepository.save(existingUser);
        }).orElseThrow() -> new RuntimeException("User with ID " + documentId + "not found"));*/


