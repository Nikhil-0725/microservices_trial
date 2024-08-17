package com.hrm.user.service.repository;

import com.hrm.user.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
//    Custom method or query
}
