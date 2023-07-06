package com.example.session2.da;

import com.example.session2.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDa extends JpaRepository<StudentEntity, Integer> {
}
