package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.ModuleEntity;

@Repository
public interface ModuleRepo extends  JpaRepository<ModuleEntity, Long> {

}
