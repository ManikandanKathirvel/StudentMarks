package com.mani.StudentMarks.Repository;

import com.mani.StudentMarks.Entity.MarksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarksRepo extends JpaRepository<MarksEntity,Long> {
    @Query(value="SELECT me FROM MarksEntity me WHERE me.rollNo = ?1")
    MarksEntity findByRollNo(int rollNo);
}
