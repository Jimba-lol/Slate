package com.slate.repo;

import com.slate.model.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {
    public Login findByEmailAndPassword(String email, String password);
}
