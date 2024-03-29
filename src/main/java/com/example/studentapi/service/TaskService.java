package com.example.studentapi.service;

import com.example.studentapi.model.TaskModel;
import com.example.studentapi.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public void saveTask(TaskModel taskModel){
        taskRepository.save(taskModel);
    }

    public List<TaskModel> getTaskList() {
        return taskRepository.findAll();
    }
}
