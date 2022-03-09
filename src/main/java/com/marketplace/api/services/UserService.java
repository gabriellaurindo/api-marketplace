package com.marketplace.api.services;

import com.marketplace.api.models.UserModel;
import com.marketplace.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //TODO: Estudar exceção correta para este caso
    public UserModel register(final UserModel user) throws Exception {
        try {
            UserModel savedUser = userRepository.save(user);
            return savedUser;
        } catch (Exception e){
            throw new Exception("An error occurred while trying to save the user, please try again!", e);
        }
    }

}
