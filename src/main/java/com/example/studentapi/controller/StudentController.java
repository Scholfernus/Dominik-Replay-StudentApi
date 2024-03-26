package com.example.studentapi.controller;

import com.example.studentapi.model.StudentModel;
import com.example.studentapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {
private final StudentService studentService;


    @GetMapping("/students")
    public String getStudentList(Model model){
        List<StudentModel> studentList = studentService.getStudentList();
        model.addAttribute("studentModel", studentList);
        return "persons/personList";
    }
    @PostMapping("/addStudent")
    public RedirectView postAddStudent(StudentModel student){
    studentService.saveStudent(student);
    return new RedirectView("/students");
    }

    @GetMapping("/addStudent")
    public String getAddStudent(){
        return "persons/addNewPerson";
    }
    @GetMapping("/editStudent")
    public String getEditStudent(){
        return "persons/editPerson";
    }
}
