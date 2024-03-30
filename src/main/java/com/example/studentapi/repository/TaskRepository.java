package com.example.studentapi.repository;

import com.example.studentapi.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface TaskRepository extends JpaRepository<TaskModel, Long> {
    List<TaskModel> findByColor(String name);

    @Modifying
    @Transactional
    @Query("UPDATE TaskModel t SET t.description= :description WHERE t.id= :id")
    int updateDescriptionById(@Param("id") Long id, @Param("description")String description);


}
