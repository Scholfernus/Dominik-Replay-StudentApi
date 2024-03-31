package com.example.studentapi.repository;

import com.example.studentapi.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
//    List<StudentModel> findStudentModelByLastName();

    Optional<StudentModel> findById(Long id);

    List<StudentModel> findDistinctByGitHubIsTrue();

    List<StudentModel> findStudentModelByTasksIsTrue();

    List<StudentModel> findStudentModelByFirstNameIsTrue();

    List<StudentModel> findDistinctByGitHubIsFalse();

    List<StudentModel> findStudentModelByTasksIsTrueAndGitHubIsTrue();


}
