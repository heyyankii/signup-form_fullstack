package com.company.project.signup.repository;

import org.springframework.data.repository.CrudRepository;
import com.company.project.signup.model.User;
public interface UserRepository extends CrudRepository<User, String> {
}
