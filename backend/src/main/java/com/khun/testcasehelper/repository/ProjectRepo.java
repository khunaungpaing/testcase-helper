package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.ProjectEntity;

@Repository
public interface ProjectRepo extends  JpaRepository<ProjectEntity, Long> {

}
