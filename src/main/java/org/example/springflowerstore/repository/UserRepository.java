package org.example.springflowerstore.repository;

import org.example.springflowerstore.user.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    Optional<AppUser> findUserByEmail(String email);

}
