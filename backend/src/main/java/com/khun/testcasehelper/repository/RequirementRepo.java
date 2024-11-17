package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.RequirementEntity;

@Repository
public interface RequirementRepo extends  JpaRepository<RequirementEntity, Long> {

}
