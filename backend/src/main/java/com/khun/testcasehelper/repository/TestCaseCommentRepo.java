package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.TestCaseCommentEntity;

@Repository
public interface TestCaseCommentRepo extends  JpaRepository<TestCaseCommentEntity, Long> {

}
