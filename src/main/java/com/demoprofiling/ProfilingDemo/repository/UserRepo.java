package com.demoprofiling.ProfilingDemo.repository;

import com.demoprofiling.ProfilingDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
