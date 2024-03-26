package com.example.studentapi.service;

import com.example.studentapi.model.StudentModel;
import com.example.studentapi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void saveStudent(StudentModel student) {
        studentRepository.save(student);
    }

    public List<StudentModel> getStudentList() {
        return studentRepository.findAll();
    }
}
