package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.TestCaseEntity;

@Repository
public interface TestCaseRepo extends  JpaRepository<TestCaseEntity, Long> {

}
