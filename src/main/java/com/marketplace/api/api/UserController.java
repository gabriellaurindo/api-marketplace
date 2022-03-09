package com.marketplace.api.api;

import com.marketplace.api.dto.UserDto;
import com.marketplace.api.models.UserModel;
import com.marketplace.api.repositories.UserRepository;
import com.marketplace.api.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user/v1")
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @Autowired
    public UserController(final UserRepository userRepository, final UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    //TODO: Colocar o isOnline no controller principal!
    @GetMapping
    public ResponseEntity<?> isOnline(){
        return ResponseEntity.ok("Api online!");
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody @Valid UserModel registerUser) throws Exception {
        UserModel user = userService.register(registerUser);
        UserDto returnUser = new UserDto();
        BeanUtils.copyProperties(user, returnUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnUser);
    }

}
