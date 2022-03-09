package com.marketplace.api.repositories;

import com.marketplace.api.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserModel, Long> {
}
