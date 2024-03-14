package com.StudentRegistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentRegistration.entity.student;

@Repository
public interface studentrepository extends JpaRepository<student, Long>{
	List<student> findByName(String name);
}
