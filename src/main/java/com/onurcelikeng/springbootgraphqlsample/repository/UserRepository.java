package com.onurcelikeng.springbootgraphqlsample.repository;

import com.onurcelikeng.springbootgraphqlsample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    User getByIdentityNumber(Long identityNumber);

    List<User> getUsersByBirthPlace(String birthPlace);
}
