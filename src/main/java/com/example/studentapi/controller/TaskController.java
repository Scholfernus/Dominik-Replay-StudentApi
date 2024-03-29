package com.example.studentapi.controller;

import com.example.studentapi.model.StudentModel;
import com.example.studentapi.model.TaskModel;
import com.example.studentapi.service.StudentService;
import com.example.studentapi.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskController {
    private final StudentService studentService;
    private final TaskService taskService;
    @GetMapping("tasks")
    public String getTaskList(Model model){
       List<TaskModel> list = taskService.getTaskList();
        model.addAttribute("taskModel", list);
        return "tasks/tasks";
    }
    @GetMapping("/addTask")
    public String getAddTask(Model model){
        List<StudentModel> list = studentService.getStudentList();
        model.addAttribute("studentModel", list);
        return "tasks/addTask";
    }
    @PostMapping("/addTask")
    public RedirectView postAddTask(TaskModel task){
        taskService.saveTask(task);
        return new RedirectView("/tasks");
    }
    @
}
