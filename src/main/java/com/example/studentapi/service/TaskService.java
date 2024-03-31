package com.example.studentapi.service;

import com.example.studentapi.model.TaskModel;
import com.example.studentapi.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaskService {
    private final TaskRepository taskRepository;

    public void saveTask(TaskModel taskModel) {
        taskRepository.save(taskModel);
    }

    public List<TaskModel> getTaskList() {
        return taskRepository.findAll();
    }

    public void getTaskById() {
    }

    public TaskModel getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(null);
    }

    public List<TaskModel> findByColor(String name) {
        List<TaskModel> color = taskRepository.findByColor(name);
        log.info("color{}", color);
        return color;
    }

    public void updateDescription(Long id, String description) {
        taskRepository.updateDescriptionById(id, description);
    }
}
