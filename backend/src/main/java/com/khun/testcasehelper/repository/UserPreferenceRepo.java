package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.UserPreferenceEntity;

@Repository
public interface UserPreferenceRepo extends  JpaRepository<UserPreferenceEntity, Long> {

}
