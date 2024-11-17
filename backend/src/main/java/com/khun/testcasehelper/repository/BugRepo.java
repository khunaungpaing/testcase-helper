package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.BugEntity;

@Repository
public interface BugRepo extends  JpaRepository<BugEntity, Long> {

}
