package com.site.restauranttier.repository;

import com.site.restauranttier.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    @Override
    Optional<User> findById(String id);
}