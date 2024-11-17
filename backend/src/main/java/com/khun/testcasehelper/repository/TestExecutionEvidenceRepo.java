package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.TestExecutionEvidenceEntity;

@Repository
public interface TestExecutionEvidenceRepo extends  JpaRepository<TestExecutionEvidenceEntity, Long> {

}
