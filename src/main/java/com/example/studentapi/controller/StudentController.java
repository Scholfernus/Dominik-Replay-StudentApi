package com.example.studentapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/students")
    public String getStudentList(){
        return "persons/personList";
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
