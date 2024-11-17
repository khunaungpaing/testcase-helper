package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.UserEntity;

@Repository
public interface UserRepo extends  JpaRepository<UserEntity, Long> {

}
