package com.khun.testcasehelper.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khun.testcasehelper.entity.TagEntity;

@Repository
public interface TagRepo extends  JpaRepository<TagEntity, Long> {

}
