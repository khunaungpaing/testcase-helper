package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.BugCommentEntity;

@Repository
public interface BugCommentRepo extends  JpaRepository<BugCommentEntity, Long> {

}
