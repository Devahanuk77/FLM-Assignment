package com.flm.jfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flm.jfs.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
