package com.laserpanda1.bankV2.repositores;

import com.laserpanda1.bankV2.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
