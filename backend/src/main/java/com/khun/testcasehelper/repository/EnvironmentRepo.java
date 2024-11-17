package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.EnvironmentEntity;

@Repository
public interface EnvironmentRepo extends  JpaRepository<EnvironmentEntity, Long> {

}
