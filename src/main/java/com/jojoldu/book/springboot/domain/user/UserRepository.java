package com.jojoldu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    // email을 통해 처음 가입하는 유저인지 판별
    Optional<User> findByEmail(String email);

}
