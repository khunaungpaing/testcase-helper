package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.DatabaseEntity;

@Repository
public interface DatabaseRepo extends  JpaRepository<DatabaseEntity, Long> {

}
