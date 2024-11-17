package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.TestExecutionRecordEntity;

@Repository
public interface TestExecutionRecordRepo extends  JpaRepository<TestExecutionRecordEntity, Long> {

}
