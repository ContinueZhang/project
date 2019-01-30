package com.manna.xunwuproject.repository;

import com.manna.xunwuproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by continue on 2019/1/3.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
